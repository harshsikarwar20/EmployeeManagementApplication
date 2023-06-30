package com.MyProject.EmployeeManagementApplication.repository;

import com.MyProject.EmployeeManagementApplication.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Integer> {


    List<Employee> findAllByEmployeeName(String userName);

}
