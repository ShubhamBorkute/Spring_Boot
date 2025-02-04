package com.nit.entityOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	private Integer id;
	
	private String state;
	
	private String city;
	
	@OneToOne
	private Employee employee;

	
	@Override
    public String toString() {
        return "Address [id=" + id + ", state=" + state + ", city=" + city + "]";
    }

}
