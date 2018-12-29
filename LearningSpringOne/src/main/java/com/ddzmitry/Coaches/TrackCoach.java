package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.NameServicesCoaches.PersonalCoachNamer;

public class TrackCoach implements Coach {
//    define private field for dependency
    private FortuneService fortuneService;
    private PersonalCoachNamer personalCoachNamer;

    public String getDailyWorkout() {
        return "Run 5 k";
    }

    public String PaceSpeech() {
        System.out.println(String.format("Hello this is your coach %s",personalCoachNamer.GetName()));
        return fortuneService.getFortune();
    }
//    Define constructor for dependency injection
//    That will be passed from applicationContext file
//          <constructor-arg ref="myFortuneService"/>
//        <constructor-arg ref="personalCoachNamer"/>

    public TrackCoach(FortuneService fortuneService, PersonalCoachNamer personalCoachNamer) {
        this.fortuneService = fortuneService;
        this.personalCoachNamer = personalCoachNamer;
    }
}
