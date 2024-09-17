package com.nt.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Employee;

import jakarta.transaction.Transactional;
@Transactional
public interface jpaRepo extends JpaRepository<Employee, Integer> {

	/*
	 * @Query("from Employee") public List<Employee> getAllEmpRecords();
	 * 
	 * @Query("from employee where empno=:id") public Employee getEmpById(Integer
	 * id);
	 */
	@Modifying
	@Query(value="insert into Employee11 (EMPNO)values(mid_seq.nextval)",nativeQuery = true)
	public int insertEmployeeNo();
	
}
