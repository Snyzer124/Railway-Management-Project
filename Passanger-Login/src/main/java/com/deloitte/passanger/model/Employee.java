package com.deloitte.passanger.model;



public class Employee {
	
	
	private int userid;
	private int employeename;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int userid, int employeename) {
		super();
		this.userid = userid;
		this.employeename = employeename;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getEmployeename() {
		return employeename;
	}
	public void setEmployeename(int employeename) {
		this.employeename = employeename;
	}
	
	

}

