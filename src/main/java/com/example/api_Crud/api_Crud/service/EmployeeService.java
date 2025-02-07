package com.example.api_Crud.api_Crud.service;

import com.example.api_Crud.api_Crud.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
