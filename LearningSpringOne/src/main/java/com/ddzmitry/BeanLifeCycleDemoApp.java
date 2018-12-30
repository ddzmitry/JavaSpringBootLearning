package com.ddzmitry;

import com.ddzmitry.Coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
//      For "prototype" scoped beans, Spring does not call the destroy method.  Gasp!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");
        CricketCoach cricketCoach = context.getBean("CrickeCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        context.close();
    }
}
