package com.MyProject.EmployeeManagementApplication.controller;

import com.MyProject.EmployeeManagementApplication.model.Employee;
import com.MyProject.EmployeeManagementApplication.model.HR;
import com.MyProject.EmployeeManagementApplication.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HrController {
    @Autowired
    private HrService hrService;

    @PostMapping(value = "/add/hr")
    private String addHR(@RequestBody HR newHr){
        return hrService.addHR(newHr);
    }

    @GetMapping(value = "/get/All/hr")
    private ResponseEntity<List<HR>> getAllHr(){
        List<HR> HRList = hrService.getAllHr();
        if(HRList.size()==0){
            return new ResponseEntity<List<HR>>(HRList, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<List<HR>>(HRList, HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/delete/by/{id}")
    private void deleteHrByName(@PathVariable Integer id){
        hrService.deleteHrByName(id);
    }


    // Hr can add Employee.............
    @PostMapping(value = "/add/employee")
    private String addEmployee(@RequestBody List<Employee> employeeList){
        return hrService.addListOfEmployee(employeeList);
    }

}
