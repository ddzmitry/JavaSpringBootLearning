package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Add Annotation will be able to access as tenisCoach Bean ID
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    private  FortuneService coachFortuneRandom;
    @Override
    public String getDailyWorkout() {
        return "Practice your Backhand Volley";
    }

    @Override
    public String PaceSpeech() {
        return coachFortuneRandom.getFortune();
    }

    @Autowired
    public void DoSomeCrazyStuff(){
        System.out.println("Doing Crazy THings!");
    }

//    Autowired Constructor
//    Qualifier has to be used inside of the constructor
    @Autowired
    public TennisCoach(@Qualifier("restFortuneService") FortuneService coachFortuneRandom) {
        this.coachFortuneRandom = coachFortuneRandom;
    }
}
