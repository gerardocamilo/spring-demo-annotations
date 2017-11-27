package com.gerardocamilo.springdemo;

import org.springframework.stereotype.Component;

@Component("mySuperCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
