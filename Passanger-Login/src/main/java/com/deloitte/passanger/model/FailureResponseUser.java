package com.deloitte.passanger.model;

import com.deloitte.passanger.entity.Login;

public class FailureResponseUser {
	
	private Login login;
	private String messageU;
	public FailureResponseUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseUser(Login login, String messageU) {
		super();
		this.login = login;
		this.messageU = messageU;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getMessageU() {
		return messageU;
	}
	public void setMessageU(String messageU) {
		this.messageU = messageU;
	}
	

}
