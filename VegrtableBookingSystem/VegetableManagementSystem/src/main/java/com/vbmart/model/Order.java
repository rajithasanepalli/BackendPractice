package com.vbmart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;;

@Entity
@Table(name="order_details")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="total_price")
	private double totalPrice;
	
	@Column(name="shipping_address")
	private String shippingAddress;
	
	@Column(name="payment_mode")
	private String paymentMode;
	

}
