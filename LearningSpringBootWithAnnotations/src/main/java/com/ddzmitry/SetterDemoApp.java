package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach = context.getBean("thatsillyCoach", Coach.class);
        System.out.println(tennisCoach.PaceSpeech());
        System.out.println(tennisCoach.getDailyWorkout());
        context.close();
    }
}
