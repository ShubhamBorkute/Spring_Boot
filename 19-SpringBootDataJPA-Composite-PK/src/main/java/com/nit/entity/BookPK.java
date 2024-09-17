package com.nit.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPK {

	private Integer bid;
	private String bname;

	public BookPK() {
		super();
	}

	public BookPK(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "BookPK [bid=" + bid + ", bname=" + bname + "]";
	}

}
