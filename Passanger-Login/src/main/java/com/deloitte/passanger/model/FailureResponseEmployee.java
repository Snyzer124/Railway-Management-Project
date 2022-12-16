package com.deloitte.passanger.model;

import com.deloitte.passanger.entity.Login;

public class FailureResponseEmployee {

	private Login login;
	private String messageE;
	public FailureResponseEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseEmployee(Login login, String messageE) {
		super();
		this.login = login;
		this.messageE = messageE;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getMessageE() {
		return messageE;
	}
	public void setMessageE(String messageE) {
		this.messageE = messageE;
	}
	
}
