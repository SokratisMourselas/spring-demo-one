package com.spring.springdemo.mainMethods;

import com.spring.springdemo.Services.DetailConfig;
import com.spring.springdemo.interfaces.Incident;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForIncidents {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DetailConfig.class);

        Incident incident = context.getBean("incidentReport", Incident.class);

        System.out.println(incident.toString());

        incident.setReceiverName("M. Verros");

        System.out.println("\n"+incident.getReceiverName().toUpperCase() + " has accepted to implement this incident");
        System.out.println("Current state: "+ incident.getImplementationState());

        context.close();


    }

}
