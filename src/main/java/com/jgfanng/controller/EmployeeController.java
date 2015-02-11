package com.jgfanng.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jgfanng.model.Employee;
import com.jgfanng.service.EmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "employee/{id:[\\d]+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping(value = "employee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "employee", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return "successful";
    }

    @RequestMapping(value = "employee/{id:[\\d]+}", method = RequestMethod.POST)
    public String updateEmployee(@PathVariable int id, @RequestBody String name) {
        employeeService.updateEmployee(id, name);
        return "successful";
    }

    @RequestMapping(value = "employee/{id:[\\d]+}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "successful";
    }
}
