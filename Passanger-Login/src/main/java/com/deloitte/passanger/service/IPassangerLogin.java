package com.deloitte.passanger.service;

import java.util.List;

import com.deloitte.passanger.entity.Login;

public interface IPassangerLogin {
	
	public Login getPassanger(Integer id);

	public List<Login> getPassangers();
	


	
}
