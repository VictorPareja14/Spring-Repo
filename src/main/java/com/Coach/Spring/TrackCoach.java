package com.Coach.Spring;

import com.dependencyInjection.Spring.FortuneService;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach (FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5 k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: "+fortuneService.getFortune();
    }

}
