package com.example.redisCRUDOperartion.service;

import com.example.redisCRUDOperartion.enitiy.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAll();
    public Optional<Employee> getEmployee(int id);
    public Employee addEmployee(Employee newEmployee);
    public String deleteEmployee(int id);
    public Optional<Employee> updateEmployee(Employee newEmployee, int id);
}
