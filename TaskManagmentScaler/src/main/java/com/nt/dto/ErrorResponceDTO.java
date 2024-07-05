package com.nt.dto;

public class ErrorResponceDTO {
private String error;

public ErrorResponceDTO(String error) {

	this.error = error;
}
public ErrorResponceDTO() {
	// TODO Auto-generated constructor stub
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}

}
