package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParameterController {

	@GetMapping("/model")
	public String getMethodName(Model model) {
		model.addAttribute("msg","Welcome to Model Uses");
		
		return "index";
	}
	
	@GetMapping("/responsebody")
	@ResponseBody
	public String getMethodName1(Model model) {
		
		
		return "How Are You !!!";
	}
	
	
	@GetMapping("/user")  //EX of @RequestParam
	public ModelAndView getData(@RequestParam("name") String name) {
		ModelAndView mav = new ModelAndView();
		String msg = "Hello Mr. " + name;
		mav.addObject("msg", msg);
		mav.setViewName("index");
		return mav;

	}

	@GetMapping("/user/{name}")  //EX of @RequestParam
	public ModelAndView getData1(@PathVariable("name") String name) {
		ModelAndView mav = new ModelAndView();
		String msg = "Good Afternoon Mr. " + name;
		mav.addObject("msg", msg);
		mav.setViewName("index");
		return mav;

	}
}
