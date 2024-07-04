package com.nt.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")

//@Primary

public class OracleImp implements UserDAO {

	public OracleImp() {
		System.out.println("OracleImp :: Constructor");
	}
	
	
	@Override
	public String getById(int id) {
		System.out.println("Oracle");
		if(id==100) {return "Shubham";}
		else if(id==200){return "Ankush";}
		
	return null;
	}

}
