package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.Coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach cricketCoach = context.getBean("CrickeCoach", CricketCoach.class);
        System.out.println(String.format("Our team is %s and coach email is %s", cricketCoach.getTeam(),
                cricketCoach.getCoachEmail()));
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.PaceSpeech());

        context.close();
    }
}
