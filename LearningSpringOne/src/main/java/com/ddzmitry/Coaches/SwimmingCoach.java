package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.NameServicesCoaches.PersonalCoachNamer;

public class SwimmingCoach implements Coach {
    private FortuneService fortuneService;
    private PersonalCoachNamer personalCoachNamer;



    public String getDailyWorkout() {
        return "Go swim 300m";
    }

    public String PaceSpeech() {
        return fortuneService.getFortune();
    }
    public SwimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public SwimmingCoach(FortuneService fortuneService, PersonalCoachNamer personalCoachNamer) {
        this.fortuneService = fortuneService;
        this.personalCoachNamer = personalCoachNamer;
    }
}
