package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class VolleyBallCoach implements Coach {
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;



    public VolleyBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        System.out.println(String.format("My email is %s",email));
        return "Play VolleyBall for 1 hour";
    }

    @Override
    public String PaceSpeech() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
