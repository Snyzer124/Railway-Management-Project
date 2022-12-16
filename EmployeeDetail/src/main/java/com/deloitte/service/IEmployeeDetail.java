package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Employee;



public interface IEmployeeDetail {
	
	public List<Employee> getEmployee(Integer id);

	public List<Employee> getEmployees();

}
