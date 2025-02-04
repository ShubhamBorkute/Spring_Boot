package com.nit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public String getExceptionHandler(Exception e) {
		
		return "error";
		
	}
}
