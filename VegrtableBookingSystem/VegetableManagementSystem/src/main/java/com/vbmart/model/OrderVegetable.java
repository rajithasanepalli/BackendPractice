package com.vbmart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orderitem_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVegetable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderVegetableId;

	@Column(name = "quantity")
	private @NotNull int quantity;
	
	@Column(name = "item_name")
	private @NotNull String itemName;
	
	@Column(name = "available_quantity")
	private @NotNull int availablequantity;
	
	@Column(name="price")
	private @NotNull int price;
	
	@Column(name = "created_date")
	private @NotNull Date createdDate;
	
	private double total;
	
}
