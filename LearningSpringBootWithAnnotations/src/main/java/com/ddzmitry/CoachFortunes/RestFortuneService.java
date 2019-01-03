package com.ddzmitry.CoachFortunes;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Restful Fortune Service";
    }
}
