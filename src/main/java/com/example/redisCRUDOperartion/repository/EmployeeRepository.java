package com.example.redisCRUDOperartion.repository;

import com.example.redisCRUDOperartion.enitiy.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
}
