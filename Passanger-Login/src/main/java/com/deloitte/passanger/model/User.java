package com.deloitte.passanger.model;






public class User {
	
	
	private int userid;
	private String username;
	private String number;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String number, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.number = number;
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
