package com.nt.service;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repository.IProductRepo;
@Service
public class IProductServiceImp implements IProductService {
    
	@Autowired
	private IProductRepo repo; 
	
	@Override
	public Integer addProduct(Product p) {
		return repo.save(p).getPid();
	}

	@Override
	public void addAllProduct(List<Product> list) {
		Iterable<Product> iterable = repo.saveAll(list);
		iterable.forEach(p->System.out.println(p));
		/*
		 * Iterator<Product> iterator = iterable.iterator();
		 * //System.out.println(iterator); while(iterator.hasNext()) {
		 * System.out.println( iterator.next()); }
		 */
	}

	@Override
	public void getAllProduct() {
		Iterable<Product> iterable = repo.findAll();
        iterable.forEach(p->System.out.println(p));
	}

	@Override
	public List<String> getpname() {
		return repo.getpname();
	}
	

	@Override
	public List<Product> getSortByValue(String param) {
		
		return repo.findAll(Sort.by(param).descending());
	}

	@Override
	public void getEmpWithPagination(int pageSize, int pageNo) {
		
		PageRequest request = PageRequest.of(pageNo-1, pageSize);
		
		Page<Product> page = repo.findAll(request);
		
		List<Product> list = page.getContent();
		
		list.forEach(System.out::println);
	}
	
	
	
	public void getEmpByQBE()
	{
		Product p=new Product();
		 p.setPname("motherboard ");
		 //p.setPprice(600.0);
		 p.setPqty(10);
		
		Example<Product> of = Example.of(p);
		
		List<Product> list= repo.findAll(of);
		
		list.forEach(System.out::println);
	}

	
	
}
