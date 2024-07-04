package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.repo.ProductRepository;

@Service
public class ProductService {

	private ProductRepository prodrepo;
	
	public ProductService(ProductRepository prodrepo) {
		this.prodrepo=prodrepo;
		System.out.println(prodrepo.getClass().getName());
	}
	
	/** Single Record Insertion  **/
	/*
	 * public void storeProduct() { Product p=new Product(); p.setpId(1001);
	 * p.setpName("Ram"); p.setpPrice(1200.0); prodrepo.save(p);
	 * System.out.println("Product Store"); }
	 */
	
	/** Multiple Record Insertion  **/
	
	/*  public void storeMultipleProduct() { List<Product>
	 * l=new ArrayList<Product>(); Scanner sc=new Scanner(System.in);
	 * System.out.println("How Many Product You Have to Store"); int i=sc.nextInt();
	 * int temp=i; while(i>0) { Product p=new Product();
	 * System.out.println("Enter Product Code"); p.setpId(sc.nextInt());
	 * System.out.println("Enter Product Name"); sc.nextLine();
	 * p.setpName(sc.nextLine()); System.out.println("Enter Product Price");
	 * p.setpPrice(sc.nextDouble()); l.add(p); i--; }
	 * 
	 * prodrepo.saveAll(l); System.out.println(temp+" Product Stored "); }
	 */
	
	/** Retrieve By Id **/
	/*
	 * public void getProductById() { Optional<Product> byId =
	 * prodrepo.findById(101); if(byId.isPresent()) { Product p=byId.get();
	 * System.out.println(p); } }
	 */
	
	/** Count Records**/
	/*
	 * public void getCount() { System.out.println(prodrepo.count()); }
	 */
	
	/** Retrieve Multiple**/
	
	/*
	 * public void getMultipleProduct() { Iterable<Product> find=prodrepo.findAll();
	 * find.forEach(System.out::println); }
	 */
	
	
	/********************************Custom Queries*************************************/
	
	public void getProductByPname(String pname) {
		prodrepo.findByPName(pname);
	}
	
	
	
	
}
