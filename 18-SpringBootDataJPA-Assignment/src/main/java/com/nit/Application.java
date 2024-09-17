package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.HostelRoomService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		HostelRoomService service = context.getBean(HostelRoomService.class);
	//	service.insertRow("Goutham", 302l);
		
		service.getCustomCol();
		
	}

}
