package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.Coaches.Coach;

public class SwimmingCoach implements Coach {
    private FortuneService fortuneService;
    public String getDailyWorkout() {
        return "Go swim 300m";
    }

    public String PaceSpeech() {
        return fortuneService.getFortune();
    }
    public SwimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
