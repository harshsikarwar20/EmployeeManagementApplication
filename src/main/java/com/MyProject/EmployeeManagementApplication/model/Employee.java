package com.MyProject.EmployeeManagementApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String employeeName;
    private String employeeRole;
    private String employeeContactNumber;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private String employeeUserName;
    private String employeePassword;
    private String employeePermanentAddress;
    private LocalDate employeeDob;

    @OneToOne(cascade = CascadeType.ALL)
    private Reports report;
}
