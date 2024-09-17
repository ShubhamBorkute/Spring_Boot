package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.DemoTable;
import com.nit.repository.DemoTableRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		DemoTableRepository repo = context.getBean(DemoTableRepository.class);
		
		DemoTable tb=new DemoTable();
		tb.setId(101);
		tb.setName("Shubham");
		
		//repo.save(tb);
		
		//System.out.println("Data Saved");
		
	}

}
