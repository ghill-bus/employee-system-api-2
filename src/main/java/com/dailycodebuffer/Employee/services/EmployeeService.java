package com.dailycodebuffer.Employee.services;

import com.dailycodebuffer.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
