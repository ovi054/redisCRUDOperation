package com.example.redisCRUDOperartion;

import com.example.redisCRUDOperartion.enitiy.Employee;
import com.example.redisCRUDOperartion.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisCrudOperartionApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(RedisCrudOperartionApplication.class, args);
	}
	public void run(String... args) throws Exception
	{
		Employee employee = new Employee(1,"Avi","Pal","avi.pal357@gmail.com");
		employeeRepository.save(employee);
	}
}
