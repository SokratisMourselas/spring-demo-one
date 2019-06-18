package com.spring.springdemo.mainMethods;

import com.spring.springdemo.interfaces.Coach;
import com.spring.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean
        Coach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Literal values printing
        System.out.println(theCoach.toString());

        System.out.println("");
        System.out.println("");

        //random Fortune print
        System.out.println("Printing a random Fortune:");

        System.out.println(theCoach.getRandomFortune());
        System.out.println(theCoach.getRandomFortune());
        System.out.println(theCoach.getRandomFortune());

        // close context
        context.close();

    }

}
