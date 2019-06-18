package com.spring.springdemo.mainMethods;

import com.spring.springdemo.interfaces.Shop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwinsServedWithLoveMain {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("real-applicationContext.xml");

        Shop twinsServedWithLove = context.getBean("twins", Shop.class);

        System.out.println( "\nPreparing selected Shop's Contact Details...\n" + twinsServedWithLove.getContactDetails()+ "\n" );

        context.close();

    }

}
