package com.gerardocamilo.springdemo;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"A smile is your passport into the hearts of others.",
			"A good way to keep healthy is to eat more Chinese food.",
			"Hard work pays off in the future, laziness pays off now."
	};

	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int num = myRandom.nextInt(data.length);
		String quote = data[num];
		return quote;
	}

}
