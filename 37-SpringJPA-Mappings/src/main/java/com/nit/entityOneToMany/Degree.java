package com.nit.entityOneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Degree {
	
	@jakarta.persistence.Id
	private Integer Id;
	
	private String name;
	
	private String type;
	
	@ManyToOne
	private Student student;

	@Override
	public String toString() {
		return "Degree [Id=" + Id + ", name=" + name + ", type=" + type + "]";
	}
	
	
	

}
