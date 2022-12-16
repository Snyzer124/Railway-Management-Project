package com.deloitte.model;

import com.deloitte.entity.Travel;

public class FailureResponsePayment {
	private Travel travel;
	private String messageP1;
	public FailureResponsePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponsePayment(Travel travel, String messageP1) {
		super();
		this.travel = travel;
		this.messageP1 = messageP1;
	}
	public Travel getTravel() {
		return travel;
	}
	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	public String getMessageP1() {
		return messageP1;
	}
	public void setMessageP1(String messageP1) {
		this.messageP1 = messageP1;
	}
	

}
