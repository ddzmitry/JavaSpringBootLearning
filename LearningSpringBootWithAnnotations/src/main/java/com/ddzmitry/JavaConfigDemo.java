package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationExample {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        Coach betaCoach = context.getBean("tennisCoach",Coach.class);
//        Since it's Prototype scope both will not equal to each other since their memory location is different
        System.out.println(alphaCoach==betaCoach);

//        However if we use Prototype scope the Instantiations are going to be the same

        Coach SwimOne = context.getBean("swimmingCoach",Coach.class);
        Coach SwimTwo = context.getBean("swimmingCoach",Coach.class);
        System.out.println(SwimOne==SwimTwo);
        context.close();
    }
}
