package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Employee;

public interface jpaRepo extends JpaRepository<Employee, Integer> {
//select * from employee11 where deptno=:depto
	public List<Employee> findByDeptno(int deptno);

	// select * from employee1 where job='SALESMAN' and deptno=30;
	public List<Employee> findByJobAndDeptno(String job, int deptno);

	@Query("SELECT e FROM Employee e WHERE e.Job = :job AND e.deptno = :deptno")
	List<Employee> findByJobAndDeptno(@Param("job") String Job, @Param("deptno") Integer deptno);
	

}
