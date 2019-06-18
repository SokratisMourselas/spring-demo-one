package com.spring.springdemo.mainMethods;

import com.spring.springdemo.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {



    public static void main(String[] args) {

        //initializing context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // loading beans
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
//        Coach betaCoach = context.getBean("myCoach", Coach.class);

//        boolean result = (alphaCoach == betaCoach);

//        System.out.println("\nPointing to the same object: " + result);
//
        System.out.println("\nMemory location of alphaCoach: "+ alphaCoach);
//
//        System.out.println("\nMemory location of alphaCoach: "+ betaCoach);

        //context closed
        context.close();
    }

}
