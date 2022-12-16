package com.deloitte.model;



public class Seat {

	
	private int seatno;
	private int userid;
	private String seattype;
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(int seatno, int userid, String seattype) {
		super();
		this.seatno = seatno;
		this.userid = userid;
		this.seattype = seattype;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getSeattype() {
		return seattype;
	}
	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}
	
	
	
}
