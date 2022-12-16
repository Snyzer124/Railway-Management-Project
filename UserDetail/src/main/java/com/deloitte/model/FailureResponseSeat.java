package com.deloitte.model;

import com.deloitte.entity.User;

public class FailureResponseSeat {

	private User user;
	private String messageS;
	public FailureResponseSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseSeat(User user, String messageS) {
		super();
		this.user = user;
		this.messageS = messageS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessageS() {
		return messageS;
	}
	public void setMessageS(String messageS) {
		this.messageS = messageS;
	}
	
}
