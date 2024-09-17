package com.nit;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


//@Profile("uat")
@Component
public class DBConnection {

	@Value("${username1}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	public DBConnection() {
		System.out.println("DBConnection");
		
	}


	
	@PostConstruct
	public void toString1() {
		System.out.println("DBConnection [username=" + username + ", password=" + password + "]");
	}


}
