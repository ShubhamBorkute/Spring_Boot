package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationController {

	@GetMapping("/")
	public String showHomePage() {
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/balance")
	public String showBalencePage(Map<String,Object>map) {
		int amount =new Random().nextInt(1000000);
		map.put("amount", amount);
		return "show_balance";
	}
	
	@GetMapping("/offers")
	public String showOffer() {
		return "offers";
	}
	
	@GetMapping("/loanApprove")
	public String approveLoan(Map<String,Object>map) {
		int amount =new Random().nextInt(1000000);
		map.put("amount", amount);
		return "loan";
	}
	
	@GetMapping("/denied")
	public String showAccessDeniedPage() {
		
		return "auth_failed";
		
	}
	
	
}
