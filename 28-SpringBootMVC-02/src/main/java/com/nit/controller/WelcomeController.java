package com.nit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("WelcomeController.... :: Constructor ");
	}
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Welcome to Spring MVC");
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/date")
	public ModelAndView getDateMsg() {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("date",new Date());
		mv.setViewName("index");
		return mv;

	}
}
