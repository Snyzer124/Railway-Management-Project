package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dao.ISeatRepo;
import com.deloitte.entity.Seat;

@Service
public class ISeatDetailImpl implements ISeatDetail {

	@Autowired
	private ISeatRepo iseatrepo;
	@Override
	public List<Seat> getSeat(Integer uid) {
		
		return iseatrepo.findByUid(uid) ;
	}

	@Override
	public List<Seat> getSeats() {
		
		return iseatrepo.findAll();
	}

}
