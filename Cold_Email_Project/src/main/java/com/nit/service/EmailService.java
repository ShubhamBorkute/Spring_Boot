package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.email.SendApplicationOnEmail;
import com.nit.email.SendEmailinquiry;
import com.nit.entity.Email;
import com.nit.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	private EmailRepository emailRepo;

	@Autowired
	private SendApplicationOnEmail emailApplication;
	
	@Autowired
	private SendEmailinquiry emailInquiry;
	
	/**
	 * For Custome Email 
	 */
	
	public String sendEmailCustomSubject(String receiver,String emailType) {
		String status=null;
		
		try {
			
			 if(emailType.equals("Inquiry")){
					status=emailInquiry.sendMail(receiver);
				}else {
					status=emailApplication.sendMaiWithCustomSubject(receiver,emailType);}
			
			Email email=new Email();
			email.setReceiver(receiver);
			email.setEmailType(emailType);
			emailRepo.save(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status+receiver;
	}
	
	/**
	 * Get All Email
	 */
	
	public List<Email> getAllEmail(){
		return emailRepo.findAll();
	}
	
	
	
	
}
