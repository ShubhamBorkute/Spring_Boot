package com.nit.entityOneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private Integer stuId;

	private String studName;
	
	private String email;
	
	@OneToMany(mappedBy = "student")
	private List<Degree> degrees;
}
