package com.nt.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImp implements IUser {

	@Override
	public String UserReg() {
		// dao logic 
		return "Successfull";
	}

}
