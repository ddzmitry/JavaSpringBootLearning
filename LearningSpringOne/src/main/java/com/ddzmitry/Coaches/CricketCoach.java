package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.NameServicesCoaches.PersonalCoachNamer;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private PersonalCoachNamer personalCoachNamer;
    private String CoachEmail;
    private String Team;


    public String getDailyWorkout() {
        return "Do some Cricket today";
    }

    public String PaceSpeech() {
        System.out.println(personalCoachNamer.GetName() + " says!");
        return this.fortuneService.getFortune();
    }
    // No argument constructor
    public CricketCoach() {
        System.out.println("Cricket coach: called");
    }

    //Setter method that will be called by spring
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter method was called");
        this.fortuneService = fortuneService;
    }

    public void setPersonalCoachNamer(PersonalCoachNamer personalCoachNamer) {
        this.personalCoachNamer = personalCoachNamer;
    }

    public void setCoachEmail(String coachEmail) {
        CoachEmail = coachEmail;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getCoachEmail() {
        return CoachEmail;
    }

    public String getTeam() {
        return Team;
    }
}
