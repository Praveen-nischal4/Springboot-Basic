package com.example.qualiferconcept;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChessCoach implements Coach {

	public ChessCoach()
	{
		System.out.println("In Cosntructor :"+getClass().getSimpleName());
	}
	
	@Override
	public String getWorkoutDetails() {
		// TODO Auto-generated method stub
	
		return "Practise Chess Match 1 hour daily";
	}

}
