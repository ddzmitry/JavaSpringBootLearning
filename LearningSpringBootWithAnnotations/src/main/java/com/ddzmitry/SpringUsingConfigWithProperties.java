package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.Coaches.FieldIjectionCoach;
import com.ddzmitry.Coaches.VolleyBallCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUsingConfigWithProperties {
    public static void main(String[] args) {

//        Using Sport Config Java Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        FieldIjectionCoach alphaCoach = context.getBean("fieldIjectionCoach",FieldIjectionCoach.class);
        System.out.println(alphaCoach.getDailyWorkout());
        System.out.println(alphaCoach.PaceSpeech());

//        Picking Bean from Config File
        VolleyBallCoach volleyCoach = context.getBean("volleyBallCoach", VolleyBallCoach.class);
        System.out.println(volleyCoach.getDailyWorkout());
        System.out.println(volleyCoach.PaceSpeech());
        System.out.println(volleyCoach.getTeam());
        System.out.println(volleyCoach.getEmail());

        context.close();

    }
}
