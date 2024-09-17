package com.nt.encodedPass;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassEncode {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encode=new BCryptPasswordEncoder();
		
		
		String shubham=encode.encode("shubham");
		String yash=encode.encode("yash");
		String kapil=encode.encode("kapil");
		String sumit=encode.encode("sumit");
		
		System.out.println(shubham);
		System.out.println(yash);
		System.out.println(kapil);
		System.out.println(sumit);
	}
	
}
