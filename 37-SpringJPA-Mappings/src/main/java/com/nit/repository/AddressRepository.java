package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entityOneToOne.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
