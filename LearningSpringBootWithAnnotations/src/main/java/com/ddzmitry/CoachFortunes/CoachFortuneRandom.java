package com.ddzmitry.CoachFortunes;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
// Annotate fo injection
public class CoachFortuneRandom implements FortuneService {

    public String getFortune() {
        ArrayList<String> Fortunes = new ArrayList<String>();
        Fortunes.add("You are Killing it");
        Fortunes.add("Great Job");
        Fortunes.add("Woot Woot");
        return Fortunes.get((int) Math.floor(Math.random()*Fortunes.size()));
    }
}
