package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.nt.dao.UserDAO;

@Component
public class UserService {
@Autowired    //field Injuction (Reflection)
//@Qualifier("oracle")
	private UserDAO dao;
	/*
	 * @Autowired public void setDao(UserDAO dao) {
	 * System.out.println("Setter injuction"); this.dao = dao; }
	 */


	/*
	 * public UserService(UserDAO dao) {
	 * System.out.println("Constructor Injuction"); this.dao=dao; }
	 */

	

	public void getdata(int id) {
		System.out.println(dao.getById(id));
	}
}
