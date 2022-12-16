package com.deloitte.model;


public class Payment {


	private int userid;
	private int upi;
	private int card;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int userid, int upi, int card) {
		super();
		this.userid = userid;
		this.upi = upi;
		this.card = card;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUpi() {
		return upi;
	}
	public void setUpi(int upi) {
		this.upi = upi;
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	
	
}

