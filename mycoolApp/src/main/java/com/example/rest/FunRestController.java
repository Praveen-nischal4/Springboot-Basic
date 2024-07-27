package com.example.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;

	@GetMapping("/")
	public String sayHello()
	{
		return "Hello World ! Praveen";
	}
	
	
	@GetMapping("/message")
	public String GreetingMesage()
	{
		return "Good Morning !";
	}
	
	@GetMapping("/workout")
	public String dailyWorkout()
	{
		return "Today u have to workout";
	}
	
	@GetMapping("/teamDetails")
	public String getDetails()
	{
		return "Coach Name: " + coachName + " <br>" + "Team Name: " + teamName;

	}
}
