package com.example.commons;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practise fast bowling 15min with break of 5min interval 3-times a day";
	}

}
