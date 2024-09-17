package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService empser = context.getBean(EmployeeService.class);
		
		//empser.getAllEmpRecords();
		
		//empser.getEmpById(7902);
		
		//empser.insertEmployeeNo();
	}

}
