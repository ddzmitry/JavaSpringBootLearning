package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.Coaches.FieldIjectionCoach;
import com.ddzmitry.Coaches.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        lower case Class will take as Bean

        //     Using Constructor Injection
//        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
//        System.out.println(tennisCoach.PaceSpeech());
//        System.out.println(tennisCoach.getDailyWorkout());
//        tennisCoach.DoSomeCrazyStuff();
//
//
//        //        Using Setter injection
//        Coach gamerCoach = context.getBean("gamerCoach",Coach.class);
//        System.out.println(gamerCoach.getDailyWorkout());
//        System.out.println(gamerCoach.PaceSpeech());
//
//        Coach fieldInjectionCoach = context.getBean("fieldIjectionCoach", Coach.class);
//        System.out.println(fieldInjectionCoach.getDailyWorkout());
//        System.out.println(fieldInjectionCoach.PaceSpeech());

        Coach SwimCoach = context.getBean("swimmingCoach",Coach.class);
        System.out.println(SwimCoach.PaceSpeech());
        System.out.println(SwimCoach.getDailyWorkout());


        context.close();

    }
}
