package com.vbmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


import lombok.Data;
 
 @Data
 
@Entity
@Table(name="customer_details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	@Column(name="cus_password" , nullable = false)
	private String customerPassword;

	@Column(name="cus_name" , nullable = false)
	@Pattern(regexp = "^[a-zA-z ]*$")
	private String customerName;

	@Column(name="cus_moble",nullable=false)
	@Pattern(regexp = "^[7-9]{1}[0-9]{9}[a-zA-Z0-9\\s]*$")
	private String customerMobile;

	@Column(name="cus_address" , nullable = false)
	private String customerAddress;

	@Column(name="cus_email" , nullable = false)
	@Email
	@NotEmpty
	private String customerEmail;
 
	@Column(name = "cus_age", nullable = false)
	@Min(value=2, message="Invalid")
	@Max(value=99, message="Invalid")
	private int age;

//	@OneToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "roleid")
//	@JsonIgnore
//	private User uses;
	

}
