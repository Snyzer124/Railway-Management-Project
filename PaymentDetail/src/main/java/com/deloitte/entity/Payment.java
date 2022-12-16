package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {

	
	private Integer uid;
	@Id
	private Integer upi;
	private Integer card;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Integer uid, Integer upi, Integer card) {
		super();
		this.uid = uid;
		this.upi = upi;
		this.card = card;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUpi() {
		return upi;
	}
	public void setUpi(Integer upi) {
		this.upi = upi;
	}
	public Integer getCard() {
		return card;
	}
	public void setCard(Integer card) {
		this.card = card;
	}
	
	
	
}
