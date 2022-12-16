package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.User;



public interface IUserDetail {
	
	public List<User> getUser(Integer id);

	public List<User> getUsers();


}
