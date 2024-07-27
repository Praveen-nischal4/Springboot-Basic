package com.example.setterdiconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${coach.age}")
	private int age;
	
	private Coach myCoach;

	@Autowired
	public void setMyCoach(Coach myCoach) {                                            //for dependency injection using setter()
		this.myCoach = myCoach;
	 }
	
	@GetMapping("/details")
	public String getDetails()
	{
		return myCoach.getCoachDetails() +age;
	}
}
