package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.AddressTable;

public interface AddressRepository extends JpaRepository<AddressTable, Integer> {

}
