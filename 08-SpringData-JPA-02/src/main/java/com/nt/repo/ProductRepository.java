package com.nt.repo;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.nt.entity.Product;
//@Repository //optional
public interface ProductRepository extends CrudRepository<Product, Integer>{
//select * from product where pName =:Pen;
	public List<Product> findByPName(String pName);
}
