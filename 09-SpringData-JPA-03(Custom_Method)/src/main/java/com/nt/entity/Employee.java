package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee11")
public class Employee {
// EMPNO ENAME      JOB              MGR        SAL       COMM     DEPTNO
	@Id
	private Integer empno;
	private String ename;
	private String job;
	private Float salary;
	private Integer comm;
	private Integer deptno;
	
}
