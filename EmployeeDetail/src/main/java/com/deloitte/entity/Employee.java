package com.deloitte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Integer uid;
	private String employeename;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer uid, String employeename) {
		super();
		this.uid = uid;
		this.employeename = employeename;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	
	
}
