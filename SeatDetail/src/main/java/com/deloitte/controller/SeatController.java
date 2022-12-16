package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.deloitte.entity.Seat;
import com.deloitte.model.Payment;
import com.deloitte.model.PaymentConsumer;
import com.deloitte.model.ResponseSeat;
import com.deloitte.service.ISeatDetail;

@RestController
@RequestMapping("/seat")
public class SeatController {
	
	@Autowired
	private ISeatDetail iseatdetail;
	
	@Autowired
	private PaymentConsumer paymentconsumer;
	
	@GetMapping("/getseats")
	public ResponseEntity<?> getSeats(){
    
		List<Seat> seatlist = iseatdetail.getSeats();
		List<Payment> paymentlist1 = paymentconsumer.getPayments();
		ResponseSeat response =new ResponseSeat(seatlist,paymentlist1);
		return new ResponseEntity<ResponseSeat>(response,HttpStatus.OK);
	
	}
	
	@GetMapping("/getseat/{uid}")
	public ResponseEntity<?> getSeat(@PathVariable("uid") Integer uid){
    
		List<Seat> seatlist = iseatdetail.getSeat(uid);
		List<Payment> paymentlist2 = paymentconsumer.getPayment(uid);
		ResponseSeat response =new ResponseSeat(seatlist,paymentlist2);
		return new ResponseEntity<ResponseSeat>(response,HttpStatus.OK);
	
	}
	
	@GetMapping("/savebyseat")
	public Payment savepayment() {
		return paymentconsumer.savepayment();
	}

}
