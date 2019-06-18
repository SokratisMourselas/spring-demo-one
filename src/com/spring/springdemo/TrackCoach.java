package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	// add an init method
	public void startup(){
		System.out.println("TrackCoach: Startup stuff");
	}

	// add a destroy method
	public void shutdown(){
		System.out.println("\nTrackCoach: Shutdown stuff");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	@Override
	public String getRandomFortune() {
		return null;
	}

}










