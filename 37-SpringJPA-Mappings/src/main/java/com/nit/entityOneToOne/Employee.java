package com.nit.entityOneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private Integer eid;
	
	private String ename;
	
	private String email;
	
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private Address address;

	 @Override
	    public String toString() {
	        return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + "]";
	    }

}
