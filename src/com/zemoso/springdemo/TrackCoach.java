package com.zemoso.springdemo;

public class TrackCoach implements Coach {
    FortuneService fortuneService;

    //Constructor Injection
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // add custom init method
    public void customInitMethod(){
        System.out.println("Inside the custom init method");
    }

    // Add custom destroy method
    public void customDestroyMethod(){
        System.out.println("Inside Custom Destroy Method");
    }
}
