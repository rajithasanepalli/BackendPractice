package com.vbmart.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

	private long customerId;
	
	private String customerPassword;

	@Pattern(regexp = "^[a-zA-z ]*$")
	private String customerName;

	@Pattern(regexp = "^[7-9]{1}[0-9]{9}[a-zA-Z0-9\\s]*$")
	private String customerMobile;

	private String customerAddress;

	@Email
	@NotNull
	private String customerEmail;
	
	private int age;
 

	
	

}
