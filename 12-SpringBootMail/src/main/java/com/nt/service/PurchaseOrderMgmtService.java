package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service("purchaseService")
public class PurchaseOrderMgmtService implements IPurchaseOrderService {
@Autowired
	private JavaMailSender sender;
@Value("${spring.mail.username}")
private String fromMail;

	@Override
	public String purchase(String[] item, double[] price, String[] emails)throws Exception {
		double billAmt=0.0;
		for(double p:price) {
			billAmt+=p;
			}
		String msg=Arrays.toString(item)+"are Purchase Having Price "+Arrays.toString(price)+"with the Bill amount "+billAmt;
		String mailStatus=sendMail(msg,emails);
		return msg+"...."+mailStatus; 
	}

	private String sendMail(String messageBody,String[] emails) throws Exception{
		MimeMessage message=sender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		helper.setFrom(fromMail);
		helper.setTo(emails);
		helper.setSubject("Hello From Shubham");
		helper.setSentDate(new Date());
		helper.setText(messageBody);
		helper.addAttachment("java_image.jpg", new ClassPathResource("java_image.jpg"));
		sender.send(message);
		return "Mail has been send !!!";

	}
}
