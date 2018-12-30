package com.ddzmitry;

import com.ddzmitry.Coaches.BaseballCoach;
import com.ddzmitry.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load the spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from spring container
//        <constructor-arg ref="myFortuneService"/> will be passed to construct the coach in Sprig Object Factory
        Coach theCoach =  context.getBean("myCoach", Coach.class);

        // call method on bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.PaceSpeech());
        // close the context
        context.close();
//        Coach created with empty constructor


    }
}
