package com.deloitte.passanger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.deloitte.passanger.entity.Login;

@Repository
public interface IPassangerRepository extends JpaRepository<Login,Integer> {
	

}
