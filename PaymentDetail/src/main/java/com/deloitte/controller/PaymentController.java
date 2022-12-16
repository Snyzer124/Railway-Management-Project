package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.entity.Payment;
import com.deloitte.service.IPaymentDetail;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private IPaymentDetail ipaymentdetail;
	
	@GetMapping("/getpayments")
	public ResponseEntity<List<Payment>> getPayments(){
		List<Payment> paymentlist = ipaymentdetail.getPayments();
		return new ResponseEntity<List<Payment>>(paymentlist,HttpStatus.OK);
	}
	
	@GetMapping("/getpayment/{uid}")
	public ResponseEntity<List<Payment>> getPayment(@PathVariable ("uid") Integer uid){
		List<Payment> paymentbyuid = ipaymentdetail.getPayment(uid);
		return new ResponseEntity<List<Payment>>(paymentbyuid,HttpStatus.OK);
	}
	
	@PostMapping("/addpayment")
	public Payment savepayment(@RequestBody Payment payment) {
		return ipaymentdetail.savePayment(payment);
}}
