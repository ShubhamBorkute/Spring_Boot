package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	public UserController() {
		System.out.println("UserController :: Contructor");
	}
	
	@GetMapping("/user")
	private ModelAndView getUser() {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("id", "A101");
		mv.addObject("name","Shubham");
		mv.addObject("salary","27000.0");
		
		mv.setViewName("user");
		return mv;
		

	}
	
}
