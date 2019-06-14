package com.spring.springdemo.mainMethods;

import com.spring.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean
        Coach theCoach = context.getBean("myBaseballCoach", Coach.class);

        //call methods on the bean
        System.out.println("BASEBALL COACH: " + theCoach.getDailyWorkout());
        System.out.println("BASEBALL COACH: " + theCoach.getDailyFortune());

        //retrieve bean
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        //call methods on the bean
        System.out.println("TRACK COACH: " + myTrackCoach.getDailyWorkout());

        context.close();

    }

}
