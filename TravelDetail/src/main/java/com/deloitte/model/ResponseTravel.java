package com.deloitte.model;

import java.util.List;

import com.deloitte.entity.Travel;

public class ResponseTravel {

	private List<Travel> travel;
	private List<Payment> payment;
	public ResponseTravel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTravel(List<Travel> travel, List<Payment> payment) {
		super();
		this.travel = travel;
		this.payment = payment;
	}
	public List<Travel> getTravel() {
		return travel;
	}
	public void setTravel(List<Travel> travel) {
		this.travel = travel;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	
	
}
