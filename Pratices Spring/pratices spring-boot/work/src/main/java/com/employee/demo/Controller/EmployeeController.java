package com.employee.demo.Controller;

import com.employee.demo.entity.Employee;
import com.employee.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }
}