package com.employee.demo.service;

import com.employee.demo.entity.Employee;
import com.employee.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }
}