package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService empser = context.getBean(EmployeeService.class);
		/*
		 * // 7499 ALLEN SALESMAN 7698 1936.12 300 Employee emp=new Employee();
		 * emp.setEmpno(7499); emp.setEname("ALLEN"); emp.setDeptno(7698);
		 * emp.setJob("SALESMAN"); emp.setSalary(1936.12f); emp.setComm(300);
		 * empser.savedata(emp);
		 */
		//empser.getEmpByDeptno(30);
		empser.getEmpByJobAndDeptno("SALESMAN",30);
		
	}

}
