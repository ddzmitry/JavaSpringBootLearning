package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.NameServicesCoaches.PersonalCoachNamer;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    private PersonalCoachNamer personalCoachNamer;



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
    public BaseballCoach(FortuneService fortuneService, PersonalCoachNamer personalCoachNamer) {
        this.fortuneService = fortuneService;
        this.personalCoachNamer = personalCoachNamer;
    }

    public BaseballCoach() {
    }
}
