package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService
{

	public String[] random = 
		{ "wings", "map of the soul", "love yourself" };
	
	public Random randomFortune = new Random();
	
	@Override
	public String getFortune() 
	{
		//Random myRandom;
		//return "Oh yes";
        int print = randomFortune.nextInt(random.length);
		String newFortune = random[print];
		
		return newFortune;

	}
	

}
