package com.MyProject.EmployeeManagementApplication.service;

import com.MyProject.EmployeeManagementApplication.model.Employee;
import com.MyProject.EmployeeManagementApplication.model.HR;
import com.MyProject.EmployeeManagementApplication.repository.IEmployeeRepository;
import com.MyProject.EmployeeManagementApplication.repository.IHrRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {
    @Autowired
    private IHrRepository hrRepository;

    @Autowired
    private IEmployeeRepository employeeRepository;
    public String addHR(HR newHr) {
        hrRepository.save(newHr);
        return "Added successfully";
    }

    public List<HR> getAllHr() {
        return hrRepository.findAllHr();
    }

//    @Transactional
    public void deleteHrByName(Integer id) {
        hrRepository.deleteById(id);
    }

    public String addListOfEmployee(List<Employee> employeeList) {
        employeeRepository.saveAll(employeeList);
        return "Added Successfully";
    }
}
