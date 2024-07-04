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

	/*
	 * public void savedata(Employee e) { Employee emp = jparepo.save(e);
	 * if(emp!=null)System.out.println("Target Saved"); else
	 * System.out.println("Failed");
	 * }
	 */

	/*
	 * public void getEmpByDeptno(int deptno){ List<Employee> byDeptno =
	 * jparepo.findByDeptno(deptno); byDeptno.forEach(System.out::println);
	 * System.out.println(byDeptno); }
	 */

public void getEmpByJobAndDeptno(String job,int deptno) {
	List<Employee> byJobAndDeptno = jparepo.findByJobAndDeptno(job, deptno);
	byJobAndDeptno.forEach(System.out::println);
	//System.out.println(byJobAndDeptno);
	
}
}
