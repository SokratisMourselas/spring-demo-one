package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class HappyFortuneService implements FortuneService {

    private String[] randomFortuneList = {"Workout no.1", "Missed Workout", "15 min. Burn energize"};

    @Override
    public String getFortune(){
        return "Today is you lucky day";
    }

    @Override
    public String getRandomFortune(){

        return randomFortuneList[(int)(Math.random() * randomFortuneList.length)];

    }

}
