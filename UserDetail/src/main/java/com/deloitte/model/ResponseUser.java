package com.deloitte.model;

import java.util.List;

import com.deloitte.entity.User;

public class ResponseUser {
	
	private List<User> user;
	private List<Seat> seats;
	private List<Travel> travel;
	public ResponseUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseUser(List<User> user, List<Seat> seats, List<Travel> travel) {
		super();
		this.user = user;
		this.seats = seats;
		this.travel = travel;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public List<Travel> getTravel() {
		return travel;
	}
	public void setTravel(List<Travel> travel) {
		this.travel = travel;
	}
	
	

}
