package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Hostel_Room_tab")
@Data
public class HostelRoom {

	@Id
	@Column(name="hid_col")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hID;

	@Column(name="Hname_col")
	private String Hname;

	@Column(name="roomno_col")
	private Long roomNo;

	@Column(name="bedno_col")
	private Long bedNo;

}
