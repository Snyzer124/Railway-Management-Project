package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.entity.Travel;
import com.deloitte.model.Payment;
import com.deloitte.model.PaymentConsumer1;
import com.deloitte.model.ResponseTravel;
import com.deloitte.service.ITravelDetail;


@RestController
@RequestMapping("/travel")
public class TravelController {
	@Autowired
	private ITravelDetail itraveldetail;
	
	@Autowired
	private PaymentConsumer1 paymentconsumer1;
	
	@GetMapping("/gettravels")
	public ResponseEntity<?> getTravels(){
    
		List<Travel> seatlist = itraveldetail.getTravels();
		List<Payment> paymentlist1 = paymentconsumer1.getPayments();
		ResponseTravel response =new ResponseTravel(seatlist,paymentlist1);
		return new ResponseEntity<ResponseTravel>(response,HttpStatus.OK);
	
	}
	
	@GetMapping("/gettravel/{uid}")
	public ResponseEntity<?> getTravel(@PathVariable("uid") Integer uid){
    
		List<Travel> seatlist = itraveldetail.getTravel(uid);
		List<Payment> paymentlist2 = paymentconsumer1.getPayment(uid);
		ResponseTravel response =new ResponseTravel(seatlist,paymentlist2);
		return new ResponseEntity<ResponseTravel>(response,HttpStatus.OK);
	
	}
	
	@GetMapping("/savebytravel")
	public Payment savepayment() {
		return paymentconsumer1.savepayment();
	}
}
