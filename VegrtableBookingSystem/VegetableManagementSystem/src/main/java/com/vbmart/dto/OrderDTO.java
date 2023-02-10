package com.vbmart.dto;

import java.util.Date;

import lombok.Data;


@Data
public class OrderDTO {

	
	private long orderId;
	
	private Date createdDate;
	
	private double totalPrice;
	

	private String shippingAddress;
	

	private String paymentMode;
}
