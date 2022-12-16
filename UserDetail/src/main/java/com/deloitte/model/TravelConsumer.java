package com.deloitte.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Travel-Client")
public interface TravelConsumer {
	
	@GetMapping("/travel/gettravels")
    public List<Travel> getTravels();

    @GetMapping("/travel/gettravel/{uid}")
    public List<Travel> getTravel(@PathVariable("uid") Integer uid);

    
	


}

