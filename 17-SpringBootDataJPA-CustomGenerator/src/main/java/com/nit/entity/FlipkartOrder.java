package com.nit.entity;

import java.util.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="FilpkartOrder_tab")
@Data
public class FlipkartOrder {
    
	@Id
	@Column(name="Order_ID_col")
	@GenericGenerator(name="order_id_gen",strategy ="com.nit.generator.OrderIDGenerator" )
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;
	
	@Column(name="Order_BY_col")
	private String orderBy;
	
	@Column(name="Order_placedDate_col")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
	
}

