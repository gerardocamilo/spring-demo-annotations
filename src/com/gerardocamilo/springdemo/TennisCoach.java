package com.gerardocamilo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside setFortuneService");
		this.fortuneService = theFortuneService;
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
