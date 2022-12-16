package com.deloitte.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



	@FeignClient(name="Seat-Client")
	public interface SeatConsumer {
		
		@GetMapping("/seat/getseats")
	    public List<Seat> getSeats();

	    @GetMapping("/seat/getseat/{uid}")
	    public List<Seat> getSeat(@PathVariable("uid") Integer uid);

	    
		
	
	
}
