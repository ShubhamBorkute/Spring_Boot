package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Product;

import jakarta.transaction.Transactional;

public interface IProductRepo  extends JpaRepository<Product, Integer> {

	@Query(value="select pro_name from product_tab" , nativeQuery=true)
	public List<String> getpname();
	

	
	
}
