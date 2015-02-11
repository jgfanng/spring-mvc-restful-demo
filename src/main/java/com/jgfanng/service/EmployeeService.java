package com.jgfanng.service;

import java.util.Collection;

import com.jgfanng.model.Employee;

public interface EmployeeService {
    public Employee getEmployeeById(int id);

    public Collection<Employee> getAllEmployees();

    void createEmployee(Employee employee);

    public void updateEmployee(int id, String name);

    public void deleteEmployee(int id);

}
