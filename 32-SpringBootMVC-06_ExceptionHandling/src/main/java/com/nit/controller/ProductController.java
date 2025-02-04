package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String getMethodName(Model model) {
		
		model.addAttribute("msg","Welcome Mr.  Shubham");
		String s=null;
		s.length();
		return "index";
		
		
	}
	
	
}
