package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Email;
import com.nit.service.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;

	@GetMapping("")
	public String getHomePage(Model model) {
		model.addAttribute("emaildata", new Email());
		return "index";
	}

	
	@PostMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emaildata") Email email, Model model) {
	    String emails = email.getReceiver();
	    String[] emailAddresses = emails.split(" "); 
	    StringBuilder status = new StringBuilder();


	    for (String receiver : emailAddresses) {
	        String emailStatus = emailService.sendEmailCustomSubject(receiver, email.getEmailType());
	        status.append(emailStatus).append(receiver).append("\n ");  

	       
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            System.err.println("Thread interrupted: " + e.getMessage());
	            Thread.currentThread().interrupt();  // Restore interrupt status
	        }
	    }
         System.out.println(status.toString());
	    model.addAttribute("msg", status.toString()); 
	    return "index"; 
	}

}
