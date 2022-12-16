package com.deloitte.passanger.model;

import com.deloitte.passanger.entity.Login;

public class FailureResponseBoth {
	
	private Login login;
	private String message1;
	private String message2;
	public FailureResponseBoth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseBoth(Login login, String message1, String message2) {
		super();
		this.login = login;
		this.message1 = message1;
		this.message2 = message2;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	

}
