package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seat {

	@Id
	private Integer seatno;
	private  Integer uid;
	private String seattype;
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(Integer seatno, Integer uid, String seattype) {
		super();
		this.seatno = seatno;
		this.uid = uid;
		this.seattype = seattype;
	}
	public Integer getSeatno() {
		return seatno;
	}
	public void setSeatno(Integer seatno) {
		this.seatno = seatno;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getSeattype() {
		return seattype;
	}
	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
	
}
