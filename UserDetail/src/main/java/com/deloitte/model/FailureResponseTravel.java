package com.deloitte.model;

import com.deloitte.entity.User;

public class FailureResponseTravel {

	private User user;
	private String messageT;
	public FailureResponseTravel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseTravel(User user, String messageT) {
		super();
		this.user = user;
		this.messageT = messageT;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessageT() {
		return messageT;
	}
	public void setMessageT(String messageT) {
		this.messageT = messageT;
	}
	
}
