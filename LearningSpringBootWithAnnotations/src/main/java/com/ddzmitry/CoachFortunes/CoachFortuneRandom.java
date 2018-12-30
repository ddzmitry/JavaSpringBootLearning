package com.ddzmitry.CoachFortunes;

import java.util.ArrayList;

public class CoachFortuneRandom implements FortuneService {

    public String getFortune() {
        ArrayList<String> Fortunes = new ArrayList<String>();
        Fortunes.add("You are Killing it");
        Fortunes.add("Great Job");
        Fortunes.add("Woot Woot");
        return Fortunes.get((int) Math.floor(Math.random()*Fortunes.size()));
    }
}
