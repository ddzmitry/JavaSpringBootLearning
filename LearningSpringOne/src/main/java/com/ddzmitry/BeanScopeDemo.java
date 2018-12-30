package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
//        Load Spring Conf
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
//    Retrieve Beans from container
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        Coach betaCoach = context.getBean("myCoach", Coach.class);
//        Call Beans
        System.out.println(alphaCoach.PaceSpeech());
        System.out.println(betaCoach.PaceSpeech());
//        If it's singleton it will be the same coach
//        If it's prototype it will be the same coach

        System.out.println(alphaCoach == betaCoach);
        System.out.println("\n Memory Location for Alpha" + alphaCoach);
        System.out.println("\n Memory Location for Beta" + betaCoach);
//Close Context
        context.close();

    }
}
