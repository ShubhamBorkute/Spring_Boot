package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.email.SendEmail;
import com.nit.entity.UserEntity;
import com.nit.service.UserService;




@Controller
public class UserController {

	@Autowired
	private SendEmail sendEmail;
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String getUserDetailsPage(Model model) {
		model.addAttribute("user", new UserEntity());
		return "registration";
	}
	
	@PostMapping("/register")
	public String saveUserDetails(Model model , UserEntity user) throws Exception {
	
		Integer uid = userService.saveUser(user);
		System.out.println("User Saved");
		
		model.addAttribute("msg", sendEmail.sendMail(user));
		return "success";
	}
	
	
}
