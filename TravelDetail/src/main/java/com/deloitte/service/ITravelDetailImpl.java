package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dao.ITravelRepo;
import com.deloitte.entity.Travel;

@Service
public class ITravelDetailImpl implements ITravelDetail {

	@Autowired
	private ITravelRepo itravelrepo;
	@Override
	public List<Travel> getTravel(Integer uid) {
		
		return itravelrepo.findByUid(uid);
	}

	@Override
	public List<Travel> getTravels() {
		
		return itravelrepo.findAll();
	}

}
