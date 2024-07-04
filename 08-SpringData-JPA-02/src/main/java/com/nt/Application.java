package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Product;
import com.nt.repo.ProductRepository;
import com.nt.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Application.class, args);
		
		
		ProductService prdser = cxt.getBean(ProductService.class);
		
		System.out.println(prdser.getClass().getName());
		//prdser.storeProduct();
		//prdser.storeMultipleProduct();
		//prdser.getProductById();
		// prdser.getCount(); 
		//prdser.getMultipleProduct();
		
		
		
	}

}
