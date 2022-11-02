package com.Coach.Spring;

import com.dependencyInjection.Spring.FortuneService;

public class CricketCoach implements Coach{
    private String email;
    private String team;


    private FortuneService fortuneService;
// no arg constructor
    public CricketCoach() {
        System.out.print("inside no-arg constructor \n");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
// setter method
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Inside setter method");
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }


}
