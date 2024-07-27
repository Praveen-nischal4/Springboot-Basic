package com.example.setterdiconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Value("${coach.name}")
	private String name;
	
	@Override
	public String getCoachDetails() {
		
	
		return  " Name = "+name +"<br>"+ "Age = ";
	}

}
