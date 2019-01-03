package com.ddzmitry;

import com.ddzmitry.CoachFortunes.CoachFortuneRandom;
import com.ddzmitry.CoachFortunes.FortuneService;
import com.ddzmitry.CoachFortunes.SadFortuneService;
import com.ddzmitry.Coaches.Coach;
import com.ddzmitry.Coaches.FieldIjectionCoach;
import com.ddzmitry.Coaches.VolleyBallCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Java Configurations
@Configuration
@ComponentScan("com.ddzmitry")
//Load Property Files in Spring Config
@PropertySource("classpath:application.properties")
public class SportConfig {
//    Define Bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean FortuneService coachFortuneRandom(){
        return new CoachFortuneRandom();
    }
    //    Define bean for coach and inject deopendency
    @Bean
    public FieldIjectionCoach fieldIjectionCoach(){
        return  new FieldIjectionCoach(coachFortuneRandom());
    }

    @Bean
    public Coach volleyBallCoach(){
        return new VolleyBallCoach(coachFortuneRandom());
    }


}
