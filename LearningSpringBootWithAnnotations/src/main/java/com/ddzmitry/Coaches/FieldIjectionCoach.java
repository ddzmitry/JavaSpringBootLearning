package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class FieldIjectionCoach implements Coach {
//  Pulling data from aplication properties  Field Level Injection
    @Value("${foo.email}")
    private String email;
    @Value("${foo.teamname}")
    private String teamname;
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        System.out.println("Team is " + teamname + "email is : " + email);
        return "Do some Field Injection";
    }
    @Override
    public String PaceSpeech() {
        return fortuneService.getFortune();
    }
    public FieldIjectionCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;

    }
}
