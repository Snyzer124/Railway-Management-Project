package com.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.entity.User;
import com.deloitte.model.ResponseUser;
import com.deloitte.model.Seat;
import com.deloitte.model.SeatConsumer;
import com.deloitte.model.Travel;
import com.deloitte.model.TravelConsumer;
import com.deloitte.service.IUserDetail;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserDetail isuserdetail;
	
	@Autowired
	private SeatConsumer seatconsumer;
	@Autowired
	private TravelConsumer travelconsumer;
	
	@GetMapping("/getusers")
	public ResponseEntity<?> getUsers(){
    
		List<User> seatlist = isuserdetail.getUsers();
		List<Seat> paymentlist1 = seatconsumer.getSeats();
		List<Travel> paymentlist10 = travelconsumer.getTravels();
		ResponseUser response =new ResponseUser(seatlist,paymentlist1,paymentlist10);
		return new ResponseEntity<ResponseUser>(response,HttpStatus.OK);
	
	}
	
	@GetMapping("/getuser/{uid}")
	public ResponseEntity<?> getTravel(@PathVariable("uid") Integer uid){
    
		List<User> seatlist = isuserdetail.getUser(uid);
		List<Seat> paymentlist1 = seatconsumer.getSeat(uid);
		List<Travel> paymentlist10 = travelconsumer.getTravel(uid);
		ResponseUser response =new ResponseUser(seatlist,paymentlist1,paymentlist10);
		return new ResponseEntity<ResponseUser>(response,HttpStatus.OK);
	
	}
	

}
