package com.nit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emailId")
	private Integer emailId;
	
	@Column(name="Receiver")
	private String receiver;
	
	@Column(name="emailType")
	private String emailType;
	
	@CreationTimestamp
	@Column(name="emailSendDate",updatable = false)
	private LocalDateTime emailSendDate;
	

	
	

}
