package com.example.redisCRUDOperartion.controller;


import com.example.redisCRUDOperartion.enitiy.Employee;
import com.example.redisCRUDOperartion.repository.EmployeeRepository;
import com.example.redisCRUDOperartion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/home")
    public String home()
    {
        return "its working";
    }

    @GetMapping("/employees")
    public List<Employee> getAll()
    {
        return employeeService.getAll();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id)
    {
        return employeeService.getEmployee(id);
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee newEmployee)
    {
        return employeeService.addEmployee(newEmployee);
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return employeeService.deleteEmployee(id);
    }
    @PutMapping("/employees/{id}")
    public Optional<Employee> updateEmployee(@RequestBody Employee newEmployee, @PathVariable int id)
    {
        return employeeService.updateEmployee(newEmployee,id);
    }
}
