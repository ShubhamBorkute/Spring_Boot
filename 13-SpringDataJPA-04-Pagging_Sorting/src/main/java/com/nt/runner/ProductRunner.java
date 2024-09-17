package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.service.IProductServiceImp;
@Component
public class ProductRunner implements ApplicationRunner {
 
	@Autowired
	private IProductServiceImp service;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Product p1=new Product();
		p1.setPname("pen");
		p1.setPprice(420.0);
		p1.setPqty(15);
		
		//System.out.println("Product Saved With PID "+service.addProduct(p1));
		
		
		Product p2=new Product();
		p2.setPname("Ram");
		p2.setPprice(1600.0);
		p2.setPqty(25);
		Product p3=new Product();
		p3.setPname("HDD");
		p3.setPprice(3400.0);
		p3.setPqty(5);
		Product p4=new Product();
		p4.setPname("MotherBoard");
		p4.setPprice(16500.0);
		p4.setPqty(14);
		
		//service.addAllProduct(List.of(p2, p3, p4));
		
		//service.getAllProduct();
		
		//System.out.println(service.getpname());
		//System.out.println(service.getpnameByID("Ram"));
		
		/*
		 * List<Product> list = service.getSortByValue("pname");
		 * list.forEach(p->System.out.println(p));
		 */
		
		/*
		 * List<Product> list1 = service.getSortByValue("pprice");
		 * list1.forEach(p->System.out.println(p));
		 */
		
		//service.getEmpWithPagination(3,3);
		
		service.getEmpByQBE();
	}

}
