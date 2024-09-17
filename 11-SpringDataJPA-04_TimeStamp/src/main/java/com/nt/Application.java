package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.ContactUsUtility;
import com.nt.repository.Contact_Us_Repository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Contact_Us_Repository repo = context.getBean(Contact_Us_Repository.class);
		
		ContactUsUtility ct=new ContactUsUtility();
		ct.setCId(101);
		ct.setCname("shubham");
		ct.setCemail("shubh@gmail.com");
		ct.setCphno(9422560148l);
		
		repo.save(ct);
	
	}

}
