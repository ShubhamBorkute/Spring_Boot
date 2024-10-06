package com.mgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mgmt.entity.UserEntity;
import com.mgmt.service.UserService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {
@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String homePage() {
		return "welcome";
	}

	@GetMapping("/adminlogin")
	public String adminLogin() {
		return "adminlogin";
	}

	@PostMapping("/adminlogin")
	public String postMethodName() {
//Admin Authentication logic
		return "adminHome";
	}
	@GetMapping("/adminHome")
	public String adminHome() {
	    return "adminHome";  // Looks for adminHome.html in templates folder
	}

	/**
	 * User Management Operation (CRUD)
	 */

	@GetMapping("/user/addUser")
	public String showAddUserForm(Model model) {
		model.addAttribute("user", new UserEntity());
		return "addUser";
	}
	
	@GetMapping("/users")
	public String getAllUser(Model model) {
		
		model.addAttribute("users", userService.getAllUser());
		/*
		 * ModelAndView mav=new ModelAndView(); mav.addObject("user",
		 * userService.getAllUser()); mav.setViewName("AllUser");
		 */
		return "ViewUser";
	}
	

	@PostMapping("/addUsers")
	public String addUser(@Valid @ModelAttribute("user") UserEntity user, BindingResult result, Model model ,RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			return "addUser";
		}
		
	//UserEntity id2 = userService.getUserById(user.getUser_id());
		
	Integer id = userService.saveUser(user);
	
	if(id!=null) redirectAttributes.addFlashAttribute("msg", "User Updtated with id : "+id);
	else redirectAttributes.addFlashAttribute("msg", "User Addded Succesfully");
	System.out.println("User Save With Id "+id);
		return "redirect:/users";
	}

	
	@GetMapping("/editUser/{uid}")
	public String editUser(@PathVariable("uid") Integer id,Model model) {
		System.out.println(id);
		UserEntity user2 = userService.getUserById(id);
		model.addAttribute("user", user2);
		return "addUser";
	}
	
	@GetMapping("/deleteUser/{uid}")
	public String getMethodName(@PathVariable("uid") Integer id,RedirectAttributes redirectAttribute) {
		
		userService.deleteUserByID(id);
		redirectAttribute.addFlashAttribute("msg", "User Deleted Succesfully");
		return "redirect:/users";
	}
	
}
