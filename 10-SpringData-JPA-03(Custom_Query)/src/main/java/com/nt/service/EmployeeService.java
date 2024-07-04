package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.repo.jpaRepo;
@Component
public class EmployeeService {
@Autowired
	private jpaRepo jparepo;

	public void getAllEmpRecords() {
		List<Employee> list = jparepo.getAllEmpRecords();
		list.forEach(System.out::println);	
	}
	
	public void getEmpById(Integer id) {
		Employee id2 = jparepo.getEmpById(id);
		System.out.println(id2);
	}
}
