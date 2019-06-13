package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class HappyFortuneService implements FortuneService {

    public String getFortune(){
        return "Today is you lucky day";
    }

}
