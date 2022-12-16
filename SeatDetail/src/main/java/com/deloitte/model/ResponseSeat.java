package com.deloitte.model;

import java.util.List;

import com.deloitte.entity.Seat;

public class ResponseSeat {
	
	private List<Seat> seat;
	private List<Payment> payment;
	public ResponseSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseSeat(List<Seat> seat, List<Payment> payment) {
		super();
		this.seat = seat;
		this.payment = payment;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	

}
