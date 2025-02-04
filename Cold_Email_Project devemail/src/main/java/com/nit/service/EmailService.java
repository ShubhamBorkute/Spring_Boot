package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nit.email.SendApplicationOnEmail;
import com.nit.email.SendEmailinquiry;


@Service
public class EmailService {
	

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
			
				/*
				 * Email email=new Email(); email.setReceiver(receiver);
				 * email.setEmailType(emailType);
				 */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status+receiver;
	}
}
