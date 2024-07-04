package com.nt.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class Product {
@Id
	private Integer pId;
	private String pName;
	private Double pPrice;
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
}
