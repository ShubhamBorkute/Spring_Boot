package com.nit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.FlipkartOrder;
import com.nit.repository.FlipkartRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		FlipkartRepository repository = context.getBean(FlipkartRepository.class);
		
		FlipkartOrder order=new FlipkartOrder();
		
		order.setOrderBy("Nagesh");
		order.setOrderPlacedDate(new Date());
		
		FlipkartOrder saveOrder = repository.save(order);
		
		System.out.println(saveOrder);
		
		context.close();
	}

}
