package com.MyProject.EmployeeManagementApplication.controller;

import com.MyProject.EmployeeManagementApplication.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/logIn") // ✅
    private ResponseEntity<String> login(@RequestParam String employeeUserName, @RequestParam String employeePassword){
        String response = employeeService.logIn(employeeUserName, employeePassword);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
