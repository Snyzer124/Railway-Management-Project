package com.deloitte.model;



public class Travel {
	
	
	private int userid;
	private int from;
	private int to;
	private int trainno;
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travel(int userid, int from, int to, int trainno) {
		super();
		this.userid = userid;
		this.from = from;
		this.to = to;
		this.trainno = trainno;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	
	

}
