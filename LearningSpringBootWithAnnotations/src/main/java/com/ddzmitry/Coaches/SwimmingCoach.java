package com.ddzmitry.Coaches;

import com.ddzmitry.CoachFortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimmingCoach implements Coach {

//    @Value("${foo.swimteam}")
//    private String swimteam;

    @Autowired
    @Qualifier("singleFortune")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
//        System.out.println(String.format("Our Team is %s",swimteam));
        return "Swim 500 meters";
    }

    @Override
    public String PaceSpeech() {
        return fortuneService.getFortune();
    }

    public SwimmingCoach() {
    }

    @PostConstruct
    public void PostConstructTest(){
        System.out.println("Post Construct");
    }
    @PreDestroy
    public void PreDestroyTest(){
        System.out.println("Pre destroy test");
    }
}
