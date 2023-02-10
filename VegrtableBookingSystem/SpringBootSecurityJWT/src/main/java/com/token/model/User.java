package com.token.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "userdetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;
	private String userPassword;
	private String userEmail;
	@ElementCollection
	@CollectionTable(name="rolestab",
	joinColumns=@JoinColumn(name="userId")
	)
	@Column(name="role")
	private Set<String> roles;
	


}
