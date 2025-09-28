package com.coding.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WellCome-Service")
public interface WellComeFiegnClient 
{
	@GetMapping("/welcome")
     public String getWCMessage();
     
}
