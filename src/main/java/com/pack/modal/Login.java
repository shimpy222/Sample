package com.pack.modal;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
@Entity
public class Login {

	@Id
	private String name;
	
	@Column
	//@NotEmpty(message="please enter your password!")
	private String pass;

	public Login() {
		super();
	}

	public Login(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
