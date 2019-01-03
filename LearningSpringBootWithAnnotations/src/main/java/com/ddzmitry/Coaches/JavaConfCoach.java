package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;

public class JavaConfCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Write Some Java Config for Spring Boot";
    }

    @Override
    public String PaceSpeech() {
        return fortuneService.getFortune();
    }

    //    Add constructor with one field
    public JavaConfCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

}
