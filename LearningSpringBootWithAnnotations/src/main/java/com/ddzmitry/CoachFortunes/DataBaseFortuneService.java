package com.ddzmitry.CoachFortunes;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "here is Fortune from Database";
    }
}
