package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entityOneToOne.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
