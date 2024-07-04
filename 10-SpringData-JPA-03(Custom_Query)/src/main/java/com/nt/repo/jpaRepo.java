package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Employee;

public interface jpaRepo extends JpaRepository<Employee, Integer> {

	@Query("from Employee")
	public List<Employee> getAllEmpRecords();
	
	@Query("from employee where empno=:id")
	public Employee getEmpById(Integer id);
	
	
}
