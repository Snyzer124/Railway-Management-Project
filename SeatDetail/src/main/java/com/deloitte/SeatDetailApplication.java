package com.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SeatDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatDetailApplication.class, args);
	}

}
