package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.Empolyee;
import com.nit.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpRepository repo = context.getBean(EmpRepository.class);
		
		Empolyee emp=new Empolyee();
		emp.setEname("Shubham");
		emp.setSalary(1200.0);
	
		repo.save(emp);
		System.out.println("Employee Saved ");
		
	}

}
