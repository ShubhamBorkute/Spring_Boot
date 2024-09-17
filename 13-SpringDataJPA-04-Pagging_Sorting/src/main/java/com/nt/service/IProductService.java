package com.nt.service;

import java.util.List;

import com.nt.entity.Product;

public interface IProductService {

	public Integer addProduct(Product p);
	public void addAllProduct(List<Product> list);
	public void getAllProduct();
	public List<String> getpname();

	public List<Product> getSortByValue(String param);
	
	public void getEmpWithPagination(int pageSize,int pageNo);
	
	

	
}
