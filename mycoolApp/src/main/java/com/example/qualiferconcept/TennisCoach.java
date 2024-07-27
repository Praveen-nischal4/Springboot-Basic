package com.example.qualiferconcept;


import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	public TennisCoach()
	{
		System.out.println("In Cosntructor :"+getClass().getSimpleName());
	}
	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
	
		return "Play Tennis 1 hour daily";
	}

}
