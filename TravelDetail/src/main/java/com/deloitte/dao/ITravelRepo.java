package com.deloitte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.Travel;

@Repository

public interface ITravelRepo extends JpaRepository<Travel,Integer> {
	
	List<Travel> findByUid(Integer uid);

}