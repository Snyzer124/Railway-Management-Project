package com.deloitte.passanger.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Login {
	
	@Id
	private Integer uid;
	private String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(Integer uid, String password) {
		super();
		this.uid = uid;
		this.password = password;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
