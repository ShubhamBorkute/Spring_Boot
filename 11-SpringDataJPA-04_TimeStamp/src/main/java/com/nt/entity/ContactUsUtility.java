package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name="contact_us_tab")
@Data
public class ContactUsUtility {
    
	@Id
	
	private Integer cId;
	
	private String cname;
	
	private String cemail;

	private Long cphno;
		
	@CreationTimestamp
	@Column(name="created_date",updatable = false)
	private  LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="updated_date",insertable = false)
	private LocalDateTime updatedDate;
	
}
