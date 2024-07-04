package com.nt.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
@Primary
public class MySqlImp implements UserDAO {

	public MySqlImp() {
	System.out.println("MySqlImp :: Constructor");
	}
	
	@Override
	public String getById(int id) {
		System.out.println("mysql");
		if(id==100) {return "Shubham";}
		else if(id==200){return "Ankush";}
		
	return null;
	}

}
