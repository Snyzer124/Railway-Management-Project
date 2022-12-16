package com.deloitte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.User;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
	
	List<User> findByUid(Integer uid);

}
