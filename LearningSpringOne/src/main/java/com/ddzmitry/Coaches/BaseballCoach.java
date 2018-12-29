package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.Coaches.Coach;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    //@Overwrite
    public String getDailyWorkout(){

        return "Spend 30 min on batting practice";
    }

    public String PaceSpeech() {
        return fortuneService.getFortune();
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

}
