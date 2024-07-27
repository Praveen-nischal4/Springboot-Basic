package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliverController {

	private OnlineOrder deliverStatus;
	
	@Autowired
    public DeliverController(@Qualifier("zomatoOnline") OnlineOrder deliverStatus) {
        this.deliverStatus = deliverStatus;
    }
	
	@GetMapping("/myDelivery")
	public String getStatus()
	{
		return deliverStatus.getDeliverStatus();
	}
}
