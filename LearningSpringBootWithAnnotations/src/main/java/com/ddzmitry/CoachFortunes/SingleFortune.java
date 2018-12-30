package com.ddzmitry.CoachFortunes;
import org.springframework.stereotype.Component;


@Component
public class SindleFortune implements  FortuneService {

    @Override
    public String getFortune() {
        return "Just do IT!";
    }
}
