package com.nt.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Table(name="product_tab")
@Data
@Entity

public class Product {

	@Id
	@Column(name="pro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@Column(name="pro_name")
	private String pname;
	
	@Column(name="pro_price")
	private Double pprice;
	
	@Column(name="pro_qty")
	private Integer pqty;
	
	
	
}
