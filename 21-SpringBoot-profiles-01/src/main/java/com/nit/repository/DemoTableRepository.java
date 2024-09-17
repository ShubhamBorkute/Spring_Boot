package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.DemoTable;

public interface DemoTableRepository extends JpaRepository<DemoTable, Integer> {

}
