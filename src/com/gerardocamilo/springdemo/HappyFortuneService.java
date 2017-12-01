package com.gerardocamilo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You learn from your mistakes... You will learn a lot today.";
	}

}
