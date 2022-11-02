package com.dependencyInjection.Spring;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    String [] data =  {"Today is your lucky day :)","Hi!!!","Get well soon <3"};
    Random random = new Random();
    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
