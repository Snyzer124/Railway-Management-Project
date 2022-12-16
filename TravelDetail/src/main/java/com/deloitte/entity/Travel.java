package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Travel {
	
	@Id
	private int trainno;	
	private Integer uid;
	private String fromstation;
	private String tostation;
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travel(int trainno, Integer uid, String fromstation, String tostation) {
		super();
		this.trainno = trainno;
		this.uid = uid;
		this.fromstation = fromstation;
		this.tostation = tostation;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getFromstation() {
		return fromstation;
	}
	public void setFromstation(String fromstation) {
		this.fromstation = fromstation;
	}
	public String getTostation() {
		return tostation;
	}
	public void setTostation(String tostation) {
		this.tostation = tostation;
	}
	
	
	
}
