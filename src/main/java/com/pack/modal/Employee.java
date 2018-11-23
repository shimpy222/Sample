package com.pack.modal;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	//@NotEmpty(message="name empty!")
	private String name;
	@Column
	//@NotEmpty(message="email is empty!")
	@Email(message="Please enter a valid email.")
	private String email;
	@Column
	//@NotEmpty(message="address cant be null")
	private String address;
	
	@Column
	@NotNull(message="empty!")
	private Long telephone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
}
