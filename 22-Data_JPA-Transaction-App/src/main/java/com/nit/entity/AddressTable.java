package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AddressTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;	
	private String city;
	private String state;
	private String country;
	private String type;
	
	private Integer eid;
}
