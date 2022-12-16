package com.deloitte.passanger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.passanger.entity.Login;
import com.deloitte.passanger.model.Employee;
import com.deloitte.passanger.model.Response;
import com.deloitte.passanger.model.User;
import com.deloitte.passanger.service.IPassangerLogin;

@RestController
@RequestMapping("/login")
public class PassangerController {
	
	@Autowired
	private IPassangerLogin ipassangerlogin;
	
	@Autowired
	private RestTemplate restTemplate;
//	private final String GET_USERS = "http://localhost:8082/user/getusers";
	private final String GET_USER = "http://localhost:8082/user/getuser/";
//	private final String GET_EMPLOYEES = "http://localhost:8083/employee/getemployees";
	private final String GET_EMPLOYEE = "http://localhost:8083/employee/getemployee/";
	
	@GetMapping("/getpassangers")
	
	public ResponseEntity<List<Login>>getPassangers(){
		
		List<Login> customerlist = ipassangerlogin.getPassangers();
		return new ResponseEntity<List<Login>>(customerlist,HttpStatus.OK);
		
	}
	
	@GetMapping("/getpassanger/{uid}")
	public ResponseEntity<?> getPassanger(@PathVariable("uid") Integer uid){
		Login login  = ipassangerlogin.getPassanger(uid);
		List<User> userlist  = restTemplate.getForObject(GET_USER + uid, List.class);
		List<Employee> employeelist  = restTemplate.getForObject(GET_EMPLOYEE + uid, List.class);
		Response response = new Response(login, userlist, employeelist);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

}
