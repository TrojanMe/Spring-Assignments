package com.luv2code.springdemo;

public class Archery implements Coach
{
	// define a private field for the dependency 
		private FortuneService fortuneService;
		
		
		// define a constructor for dependency injection 
		public Archery (FortuneService theFortuneService)
		{
			fortuneService = theFortuneService;
		}
		
		
		@Override
		public String getDailyWorkout()
		{
			return "Get 30 minutes of practice";
		}

		@Override
		public String getDailyFortune() 
		{
			// use my fortuneService to get a fortune 
			return fortuneService.getFortune();
		}


}
