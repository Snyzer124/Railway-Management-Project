package com.deloitte.passanger.model;

import java.util.List;

import com.deloitte.passanger.entity.Login;



public class Response {

	private Login login;
	private List<User> user;
	private String employee;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Login login, List<User> user, List<Employee> employeelist) {
		super();
		this.login = login;
		this.user = user;
		this.employee = employee;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}

	

}
