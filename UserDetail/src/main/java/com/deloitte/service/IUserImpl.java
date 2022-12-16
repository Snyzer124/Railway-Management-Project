package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dao.IUserRepo;
import com.deloitte.entity.User;

@Service
public class IUserImpl implements IUserDetail {

	@Autowired
	private IUserRepo iuserrepo;
	
	@Override
	public List<User> getUser(Integer uid) {
		
		return iuserrepo.findByUid(uid) ;
	}

	@Override
	public List<User> getUsers() {
		
		return iuserrepo.findAll();
	}

	
}
