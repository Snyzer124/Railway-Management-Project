package com.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TravelDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelDetailApplication.class, args);
	}

}
