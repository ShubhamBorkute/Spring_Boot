package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.entity.Product;
import com.nit.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService prodser;
	
	
	@GetMapping("/product")
	public ModelAndView getAllProducts() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("list", prodser.getAllProduct());
		
		mav.setViewName("viewProduct");
		
		return mav;
	}
	
	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("product", new Product());
		mav.setViewName("addProduct");
		
		return mav;
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(Product p, RedirectAttributes redirectAttributes ) {
		
		Integer pid=p.getPId();
		
		Integer i=prodser.saveProduct(p);
		System.out.println(p);
	
		if(pid != null) {
			redirectAttributes.addFlashAttribute("msg", "Product Updated.. With Id " + i);
		}else {
			redirectAttributes.addFlashAttribute("msg", "Product Added.. With Id " + i);
		}

		return "redirect:/product";
	}
	
	@GetMapping("/editProduct/{pid}")
	public ModelAndView editProduct(@PathVariable("pid") Integer id) {
		
		System.out.println(id);
		Product p=prodser.getProductById(id);
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("product", p);
		
		mav.setViewName("editProduct");
		
		return mav;
	}
	
	/*
	 * @GetMapping("/delete/{pid}") public String
	 * deleteProduct(@PathVariable("pid")Integer id,RedirectAttributes
	 * redirectAttributes) {
	 * 
	 * String msg=prodser.deleteProductById(id);
	 * 
	 * redirectAttributes.addFlashAttribute("msg", msg);
	 * 
	 * return "redirect:/product"; }
	 */
	
	@GetMapping("/delete/{pid}")
	public String deleteProduct(@PathVariable("pid")Integer id,RedirectAttributes redirectAttributes) {
		
	//	String msg=prodser.deleteProductById(id);
//Soft Delete 
		Product id2 = prodser.getProductById(id);
		id2.setActiveSW("N");
		Integer i = prodser.saveProduct(id2);
	    redirectAttributes.addFlashAttribute("msg", "Product Deleted"+i);

		return "redirect:/product";
	}
}
