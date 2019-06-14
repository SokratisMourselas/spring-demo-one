package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // create a no-arg constructor

    public CricketCoach() {
        System.out.println("Cricket Coach: inside the no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Cricket Coach: inside the setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}
