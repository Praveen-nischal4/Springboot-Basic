package com.example.rest;

import com.example.commons.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	//define a private field for dependency
	private Coach mycoach;
	
	//define a constructor  for dependency injection
	@Autowired
	public DemoController(Coach thecoach)
	{
		this.mycoach =thecoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout()
	{
		return mycoach.getDailyWorkout();
	}
}
