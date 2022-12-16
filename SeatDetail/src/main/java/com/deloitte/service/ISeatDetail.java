package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Seat;



public interface ISeatDetail {
	
	public List<Seat> getSeat(Integer id);

	public List<Seat> getSeats();

}
