package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.CoachFortuneRandom;
import com.ddzmitry.CoachFortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamerCoach implements Coach {

    private FortuneService fortuneService;

    public GamerCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "play VideoGames for 24 hours";
    }

    @Override
    public String PaceSpeech() {
        return fortuneService.getFortune();
    }

//    Setter Method on Setter ()
    @Autowired
    @Qualifier("coachFortuneRandom")
    public void setCoachFortuneRandom(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
