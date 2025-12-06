package com.yogeshjava.Day63_SpringBootData;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//This is known as Entity class / Value Object / Data Transfer Object (DTO)

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="userid")
	String user;
	@Column(name="password")
	String pass;

	public User() {
		
	}
	
	public User(String v1, String v2) {
		user=v1;
		pass=v2;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
