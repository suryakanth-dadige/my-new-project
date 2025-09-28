package com.coding.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.client.WellComeFiegnClient;

@RestController
public class GreetControler 
{
	@Autowired
	public WellComeFiegnClient welComeFiegnClient;
	
	@GetMapping("/greet")
   public String getGMessage()
   {
		String wMsg=welComeFiegnClient.getWCMessage();
	   String gMsg="Good Morning ";
	   return gMsg+wMsg;
   }
}
