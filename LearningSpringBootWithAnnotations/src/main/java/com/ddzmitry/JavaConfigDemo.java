package com.ddzmitry;

import com.ddzmitry.Coaches.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {

//        Using Sport Config Java Class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
