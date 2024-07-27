package com.example.qualiferconcept;


import org.springframework.stereotype.Component;

@Component
public class BatmintonCoach implements Coach {

	public BatmintonCoach()
	{
		System.out.println("In Cosntructor :"+getClass().getSimpleName());
	}
	
	@Override
	public String getWorkoutDetails() {
	
		return "play batminton  1 hour";
	}

}
