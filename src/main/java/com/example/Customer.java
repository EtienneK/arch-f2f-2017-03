package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Long id;
	
	private String firstname;
	private String lastname;
	@Email
	private String emailAddress;
}
