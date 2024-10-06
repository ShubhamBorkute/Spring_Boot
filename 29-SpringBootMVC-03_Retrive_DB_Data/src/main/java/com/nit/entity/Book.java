package com.nit.entity;

import java.sql.Blob;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name="Book_tab")
public class Book{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String bookName;
	
	private String bookAuthor;
	
	private String category;
	
	private Double price;
	
	private String description;
	@CreationTimestamp
	@Column(name="created_date",updatable = false)
	private LocalDateTime date; 
	/*
	 * @Lob
	 * 
	 * @Column(name="image",columnDefinition = "BLOB",length = 5000) private byte[]
	 * image;
	 */
}
