package com.deloitte.model;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Payment-Client")
public interface PaymentConsumer1 {
	
	@GetMapping("/payment/getpayments")
    public List<Payment> getPayments();

    @GetMapping("/payment/{uid}")
    public List<Payment> getPayment(@PathVariable("uid") Integer uid);

    @GetMapping("/payment/addpayment")
    public Payment savepayment();
	
	

}
