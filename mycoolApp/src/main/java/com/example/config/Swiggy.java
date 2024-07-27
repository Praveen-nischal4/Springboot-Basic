package com.example.config;

import org.springframework.stereotype.Component;

@Component
public class Swiggy implements OnlineOrder {

	@Override
	public String getDeliverStatus() {
		
		return "Fod will delivered within 2 hours";
	}

}
