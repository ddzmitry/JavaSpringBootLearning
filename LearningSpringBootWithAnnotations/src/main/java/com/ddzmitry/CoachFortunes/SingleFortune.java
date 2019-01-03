package com.ddzmitry.CoachFortunes;
import org.springframework.stereotype.Component;


@Component
public class SingleFortune implements  FortuneService {

    @Override
    public String getFortune() {

        return "Just do IT!";
    }
}
