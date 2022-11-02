package com.Coach.Spring;

import com.dependencyInjection.Spring.FortuneService;

public class BaseballCoach implements Coach {
    //definir atributo privado para la dependencia
    private FortuneService fortuneService;
    //definir atributo privado para la dependencia

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use myFortuneService to get a fortunne
        return fortuneService.getFortune();
    }


}
