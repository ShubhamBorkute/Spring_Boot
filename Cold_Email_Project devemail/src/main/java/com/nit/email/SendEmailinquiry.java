package com.nit.email;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;
@Component
public class SendEmailinquiry {

		@Autowired
		private JavaMailSender sender;
		
	@Value("${spring.mail.username}")
	private String fromMail;

		
		public String sendMail(String receiver) throws Exception{
			MimeMessage message=sender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			helper.setFrom(fromMail);
			helper.setTo(receiver);
			helper.setSubject("Inquiry About Entry-Level Opportunities");
			helper.setSentDate(new Date());
			StringBuilder emailContent = new StringBuilder();
			emailContent.append("Dear HR Team,\n\n")
            .append("I hope this message finds you well. My name is Shubham Borkute, and I am a recent MCA graduate with a strong foundation in Java, ")
            .append("data structures, web development, and full-stack Java development. I am reaching out to express my interest in entry-level opportunities ")
            .append("within your esteemed company.\n\n")
            .append("I am eager to apply my technical skills and passion for problem-solving in a dynamic work environment. ")
            .append("I would be grateful for any information about current or upcoming roles that align with my background. ")
            .append("I am excited about the possibility of contributing to your team’s success.\n\n")
            .append("Thank you for your time and consideration. I look forward to connecting with you.\n\n")
            .append("Best regards,\n\n")
            .append("Shubham Borkute\n")
            .append("9422560148\n")
            .append("https://shubhamborkute.netlify.app\n")
            .append("https://www.linkedin.com/in/shubham-borkute-70960a222/");

		    
		    // Set email content as plain text
	        helper.setText(emailContent.toString(), false);

	        // Attach the PDF resume
			String resumePath = "C:\\Users\\ShubhamBorkute\\Downloads\\Shubham_Borkute_dev_CV.pdf";

	        //String resumePath = "C:\\Users\\ShubhamBorkute\\Downloads\\ShubhamBorkute_CV_RF.pdf";
	        FileSystemResource file = new FileSystemResource(new File(resumePath));
	        helper.addAttachment("Shubham_Borkute_CV.pdf", file);

		    
		    sender.send(message);
			return "Inquiry Application has been send To !!!";

		}
		
		

	}

