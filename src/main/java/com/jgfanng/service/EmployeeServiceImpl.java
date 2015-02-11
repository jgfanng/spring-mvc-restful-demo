package com.jgfanng.service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import com.jgfanng.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<Integer, Employee> map;

    public EmployeeServiceImpl() {
        map = new TreeMap<Integer, Employee>();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return map.get(id);
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return map.values();
    }

    @Override
    public void createEmployee(Employee employee) {
        map.put(employee.getId(), employee);
    }

    @Override
    public void updateEmployee(int id, String name) {
        map.get(id).setName(name);
    }

    @Override
    public void deleteEmployee(int id) {
        map.remove(id);
    }

}
