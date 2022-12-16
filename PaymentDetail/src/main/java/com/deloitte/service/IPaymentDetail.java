package com.deloitte.service;

import java.util.List;

import com.deloitte.entity.Payment;



public interface IPaymentDetail {
	
	public List<Payment> getPayment(Integer id);

	public List<Payment> getPayments();
	
	public Payment savePayment(Payment payment);

}
