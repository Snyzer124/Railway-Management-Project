package com.deloitte.model;

import com.deloitte.entity.User;

public class FailureResponseBoth {
	
	private User user;
	private String message3;
	private String message4;
	public FailureResponseBoth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponseBoth(User user, String message3, String message4) {
		super();
		this.user = user;
		this.message3 = message3;
		this.message4 = message4;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	public String getMessage4() {
		return message4;
	}
	public void setMessage4(String message4) {
		this.message4 = message4;
	}
	

}
