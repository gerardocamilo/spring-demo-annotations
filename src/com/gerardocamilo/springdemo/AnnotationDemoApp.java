package com.gerardocamilo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the beans
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
