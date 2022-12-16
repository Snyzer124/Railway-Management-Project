package com.deloitte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.entity.Seat;


public interface ISeatRepo extends JpaRepository<Seat,Integer>{
	List<Seat> findByUid(Integer uid);

}
