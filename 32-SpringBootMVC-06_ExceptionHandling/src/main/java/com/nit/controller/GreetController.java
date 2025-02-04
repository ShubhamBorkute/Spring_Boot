package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GreetController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg","Welcome Mr.  Shubham");
		int i=10/0;
		return "index";
	}
	
	@GetMapping("/greet")
	public String getMethodName(Model model) {
		model.addAttribute("msg","Welcome Mr.  Shubham");
		return "index";
	}
	
	
}
