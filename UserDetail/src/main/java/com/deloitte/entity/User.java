package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	private Integer uid;
	@Id
	private String username;
	private String number;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String username, String number, String email) {
		super();
		this.uid = uid;
		this.username = username;
		this.number = number;
		this.email = email;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
