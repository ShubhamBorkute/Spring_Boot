package com.nit.email;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.nit.entity.UserEntity;

import jakarta.mail.internet.MimeMessage;

@Component
public class SendEmail {
	
	@Autowired
	private JavaMailSender sender;
	
@Value("${spring.mail.username}")
private String fromMail;

public String sendMail(UserEntity u) throws Exception{
	MimeMessage message=sender.createMimeMessage();
	MimeMessageHelper helper=new MimeMessageHelper(message,true);
	helper.setFrom(fromMail);
	helper.setTo(u.getEmail());
	helper.setSubject("Registration Confirmatiom");
	helper.setSentDate(new Date());
	helper.setText("User Registration Got Succesful"+u);
	sender.send(message);
	return "Mail has been send !!!";

}

}
