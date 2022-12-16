package com.deloitte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.entity.Payment;

@Repository

public interface IPaymentRepo extends JpaRepository<Payment,Integer> {
	
	List<Payment> findByUid(Integer uid);

}


