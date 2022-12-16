package com.deloitte.model;

import com.deloitte.entity.Seat;

public class FailureResponsePayment {
	
	private Seat seat;
	private String messageP2;
	public FailureResponsePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponsePayment(Seat seat, String messageP2) {
		super();
		this.seat = seat;
		this.messageP2 = messageP2;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public String getMessageP2() {
		return messageP2;
	}
	public void setMessageP2(String messageP2) {
		this.messageP2 = messageP2;
	}
	

}
