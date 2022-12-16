package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.entity.Employee;

import com.deloitte.service.IEmployeeDetail;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeDetail iemployeedetail;
	
	@GetMapping("/getemployees")
	public ResponseEntity<List<Employee>> getEmployees(){
		List<Employee> employeelist = iemployeedetail.getEmployees();
		return new ResponseEntity<List<Employee>>(employeelist,HttpStatus.OK);
	}
	
	@GetMapping("/getemployee/{uid}")
	public ResponseEntity<List<Employee>> getEmployeeByUid(@PathVariable("uid") Integer uid) {
		List<Employee> orderByUid = iemployeedetail.getEmployee(uid);// TODO check out the Implementation
		return new ResponseEntity<List<Employee>>(orderByUid, HttpStatus.OK);
	

	
}}
