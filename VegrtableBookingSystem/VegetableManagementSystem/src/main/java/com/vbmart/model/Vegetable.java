package com.vbmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vwgetable_details")
public class Vegetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vegetableId;

	@Column(name="veg_name" , nullable = false)
	private String vegetableName;
	
	@Column(name="veg_price" , nullable = false)
	private double vegetablePrice;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;


	
	

}
