package com.spring.springdemo.mainMethods;

import com.spring.springdemo.Services.DetailConfig;
import com.spring.springdemo.interfaces.Shop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwinsServedWithLoveMain {


    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("real-applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DetailConfig.class);

        Shop twinsServedWithLove = context.getBean("twins", Shop.class);

        System.out.println( "\nPreparing selected Shop's Contact Details...\n" + twinsServedWithLove.getContactDetails()+ "\n" );

        // printing from injection
        System.out.println("Number of visitors: " + twinsServedWithLove.getNumberOfVisitors());

        // Creating another instance of Twins shop
        Shop twinsServedWithLove2 = context.getBean("twins", Shop.class);
        System.out.println("New number of visitors: " + twinsServedWithLove2.getNumberOfVisitors());

        context.close();

    }

}
