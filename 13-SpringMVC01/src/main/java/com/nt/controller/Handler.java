package com.nt.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Student;

@RestController
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
		return st.toString();
	}

}
