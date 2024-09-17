package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Empolyee;

public interface EmpRepository extends JpaRepository<Empolyee, Integer> {

}
