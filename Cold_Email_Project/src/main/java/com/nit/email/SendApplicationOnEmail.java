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
public class SendApplicationOnEmail {

	@Autowired
	private JavaMailSender sender;

	@Value("${spring.mail.username}")
	private String fromMail;

	public String sendMaiWithCustomSubject(String receiver, String emailType) throws Exception {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setFrom(fromMail);
		helper.setTo(receiver);
		helper.setSubject("Application for " + emailType + " Position Fresher");
		helper.setSentDate(new Date());

		StringBuilder emailContent = new StringBuilder();
		emailContent.append("Dear HR Team,\n\n").append("I am excited to apply for the " + emailType
				+ " role at your esteemed organization. With a Master’s in Computer Applications and certifications in Java and Spring Boot, I have built a solid foundation in software development, specializing in Java, Spring Framework, SQL, Oracle, MySQL, HTML5, CSS3, and JavaScript React (Basic).\n\n")
				.append("My projects, such as the Task Management System and Invoice Processing System, have allowed me to apply my technical skills to develop efficient and user-centric solutions. These experiences have also enhanced my problem-solving abilities and strengthened my commitment to learning and growth.\n\n")
				.append("Additionally, my communication and analytical skills will help me understand and meet project requirements effectively.\n\n")
				.append("I completely understand that you may be busy, and it’s perfectly fine if you can’t respond immediately. ")
				.append("Please feel free to get back to me when convenient.\n\n")
				.append("I have attached my resume for your review. Please contact me at +91-9422560148 if my profile matches your requirements.\n\n")
				.append("Thank you for considering my application.\n\n").append("Best regards,\n\n")
				.append("Shubham Borkute\n").append("9422560148\n")
				.append("https://www.linkedin.com/in/shubham-borkute-70960a222/");

		helper.setText(emailContent.toString(), false);

		String resumePath = "C:\\Users\\ShubhamBorkute\\Downloads\\Shubham_Borkute_dev_CV.pdf";
		FileSystemResource file = new FileSystemResource(new File(resumePath));
		helper.addAttachment("Shubham_Borkute_CV.pdf", file);

		sender.send(message);

		return emailType + " Application Has been Sent To !";
	}

}
