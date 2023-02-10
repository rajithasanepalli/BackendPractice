package com.vbmart.dto;

import java.util.Date;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class OrderVegetableDTO {
	private long orderVegetableId;


	private @NotNull int quantity;
	
	private @NotNull String itemName;
	
	private @NotNull int availablequantity;
	
	private @NotNull int price;
	
	private @NotNull Date createdDate;
	
	private double total;
}
