package com.mgmt.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "User_tab")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;

	@NotBlank(message = "First Name is required")
	@Size(min = 2, max = 25, message = "First Name Should be between 3 to 25 characters")
	private String firstName;

	@NotBlank(message = "Last Name is required")
	@Size(min = 3, max = 25, message = "Last Name should be between 3 to 25 characters")
	private String lastName;

	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "phone number must be a valid 10-digit number")
	private String phoneNo;

	@NotBlank(message = "email is required")
	@Email(message = "email Should be valid")
	private String email;

	@NotBlank(message = "Address is required")
	@Size(min = 5, max = 100, message = "Address should be between 5 and 100 characters")
	private String address;

}
