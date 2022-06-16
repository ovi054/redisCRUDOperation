package com.example.redisCRUDOperartion.service;

import com.example.redisCRUDOperartion.enitiy.Employee;
import com.example.redisCRUDOperartion.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll() {
        Iterable<Employee> result = employeeRepository.findAll();
        List<Employee> employeesList = new ArrayList<Employee>();
        result.forEach(employeesList::add);
        return employeesList;
    }

    @Override
    public Optional<Employee> getEmployee(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;
    }

    @Override
    public Employee addEmployee(Employee newEmployee) {
        //String id = String.valueOf(new Random().nextInt());
        Employee emp = new Employee(newEmployee.getId(), newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getEmail());
        employeeRepository.save(emp);
        return emp;
    }

    @Override
    public String deleteEmployee(int id) {
        Boolean result = employeeRepository.existsById(id);
        employeeRepository.deleteById(id);
        return "{ \"success\" : "+ (result ? "true" : "false") +" }";
    }

    @Override
    public Optional<Employee> updateEmployee(Employee newEmployee, int id) {
        Optional<Employee> optionalEmp = employeeRepository.findById(id);
        if (optionalEmp.isPresent()) {
            Employee emp = optionalEmp.get();
            emp.setId(newEmployee.getId());
            emp.setFirstName(newEmployee.getFirstName());
            emp.setLastName(newEmployee.getLastName());
            emp.setEmail(newEmployee.getEmail());
            employeeRepository.save(emp);
        }
        return optionalEmp;
    }
}
