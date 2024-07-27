package com.example.qualiferconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private Coach mycoach;
	
	/*
	 * @Autowired public void setCoach(Coach theCoach) { this.mycoach=theCoach; }
	 */
	
	@Autowired
	 public MyController(@Qualifier("chessCoach") Coach theCoach)
	{
		System.out.println("In constructor :"+getClass().getSimpleName());
		this.mycoach=theCoach;
	}
	
	
	@GetMapping("/mycoach")
	public String getCoach()
	{
		return mycoach.getWorkoutDetails();
	}
	
}
