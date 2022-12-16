package com.deloitte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.dao.IPaymentRepo;
import com.deloitte.entity.Payment;

@Service
public class IPaymentDetailImpl implements IPaymentDetail {

	@Autowired
	private IPaymentRepo ipaymentrepo;
	@Override
	public List<Payment> getPayment(Integer uid) {
		
		return ipaymentrepo.findByUid(uid);
	}

	@Override
	public List<Payment> getPayments() {
		
		return ipaymentrepo.findAll();
	}

	@Override
	public Payment savePayment(Payment payment) {
		
		return ipaymentrepo.save(payment);
	}

}
