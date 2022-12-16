package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Travel;



public interface ITravelDetail {
	
	public List<Travel> getTravel(Integer id);

	public List<Travel> getTravels();

}
