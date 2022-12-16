package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dao.IEmployeeRepo;
import com.deloitte.entity.Employee;

@Service
public class IEmployeeDetailImpl implements IEmployeeDetail {

	@Autowired
	private IEmployeeRepo iemployeerepo;
	@Override
	public List<Employee> getEmployee(Integer uid) {
		
		return iemployeerepo.findByUid(uid);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return iemployeerepo.findAll();
	}

}
