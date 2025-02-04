package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nit.entityOneToOne.Employee;
import com.nit.repository.EmployeeRepository;

@SpringBootApplication
public class Application {
 
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
