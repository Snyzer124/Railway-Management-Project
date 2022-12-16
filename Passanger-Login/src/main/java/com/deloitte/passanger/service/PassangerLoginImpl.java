package com.deloitte.passanger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.passanger.dao.IPassangerRepository;
import com.deloitte.passanger.entity.Login;

@Service
public class PassangerLoginImpl implements IPassangerLogin {

	@Autowired
	private IPassangerRepository iPassangerRepository;
	
	@Override
	public Login getPassanger(Integer id) {
		
		return iPassangerRepository.findById(id).get() ;
	}

	@Override
	public List<Login> getPassangers() {
		
		return iPassangerRepository.findAll();
	}

	
}
