package com.nit.service;

import java.util.List;

import com.nit.entity.Product;

public interface ProductService {

	public List<Product> getAllProduct();
	
	public Integer saveProduct(Product p);
	
	public Product getProductById(Integer id);
	
	public String deleteProductById(Integer id);
}
