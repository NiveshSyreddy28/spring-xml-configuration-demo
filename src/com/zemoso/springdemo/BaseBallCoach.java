package com.zemoso.springdemo;

public class BaseBallCoach implements Coach{
    FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    public String getDailyWorkout(){
        return "Practice batting for 30 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
