package com.nt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.entity.Student;

@Controller
@RequestMapping("/")
public class Handler {

	@GetMapping("/")
	public String get() {
		return "welcome";
	}

	@GetMapping("/reg")
	public String getreg(@ModelAttribute("std") Student st) {
		System.out.println(st);
		return "regs";
	}

	@PostMapping("/getdata")
	public String eggfdg(@ModelAttribute("std") Student st) {
		System.out.println(st);
		return "regs";
	}

}
