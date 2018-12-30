package com.ddzmitry.Coaches;

import org.springframework.stereotype.Component;

//Add Annotation
@Component("thatsillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your Backhand Volley";
    }

    @Override
    public String PaceSpeech() {
        return "Yo Yo";
    }

}
