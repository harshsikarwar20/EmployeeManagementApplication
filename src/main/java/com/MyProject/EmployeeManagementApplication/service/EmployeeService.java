package com.MyProject.EmployeeManagementApplication.service;

import com.MyProject.EmployeeManagementApplication.model.Employee;
import com.MyProject.EmployeeManagementApplication.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;
    static List<Employee> loggedInEmployee = new ArrayList<>();
    public String logIn(String employeeUserName, String employeePassword) {
        List<Employee> employeeList = employeeRepository.findAllByEmployeeName(employeeUserName);
        if(employeeList.isEmpty()){
            return "User Doesn't exist!";
        }else{
            for (Employee employee : employeeList){
                if(employee.getEmployeePassword().equals(employeePassword)) {
                    loggedInEmployee.add(employee);
                    return "User with Username:" + employeeUserName + " login success!";
                }
            }
            return "Please Enter correct password";
        }
    }
}
