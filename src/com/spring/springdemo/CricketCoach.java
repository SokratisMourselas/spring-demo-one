package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
}