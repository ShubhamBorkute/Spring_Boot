package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Product;
import com.nit.repo.ProductRepository;
@Service
public  class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public List<Product> getAllProduct() {
		//return repo.findAll() ;
		return repo.findByActiveSW("Y");
	}
	
	public Integer saveProduct(Product p){
	if(p.getActiveSW()==null	)p.setActiveSW("Y");
		return repo.save(p).getPId();
	}

	@Override
	public Product getProductById(Integer id) {
		return repo.getById(id);
	}

	@Override
	public String deleteProductById(Integer id) {
		
		repo.deleteById(id);
		return "product with id "+id+" Deleted "; 
	}

}
