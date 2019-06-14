package com.spring.springdemo;

import com.spring.springdemo.Services.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("Just set the email address to: "+emailAddress);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("Just set the team name to: "+team);
    }

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

    @Override
    public String getRandomFortune(){
        return fortuneService.getRandomFortune();
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Cricket Coach: inside the setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String toString() {
        return "CricketCoach[" +
                "fortuneService=" + fortuneService.getFortune() +
                ", emailAddress='" + emailAddress + '\'' +
                ", team='" + team + '\'' +
                ']';
    }
}
