package com.spring.springdemo.Services;

import com.spring.springdemo.Objects.People.Author;
import com.spring.springdemo.Objects.IncidentReport;
import com.spring.springdemo.Objects.People.Receiver;
import com.spring.springdemo.Objects.Twins;
import com.spring.springdemo.Objects.TwinsTables;
import com.spring.springdemo.interfaces.Incident;
import com.spring.springdemo.interfaces.Shop;
import com.spring.springdemo.interfaces.Tables;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.springdemo")
@PropertySource("classpath:mylogger.properties")
public class DetailConfig {

    @Bean
    public Tables twinsTables(){
        return new TwinsTables();
    }

    @Bean
    public Shop twins(){
        return new Twins(twinsTables());
    }

    @Bean
    public Author author(){
        return new Author();
    }

    @Bean
    public Receiver receiver(){
        return new Receiver();
    }


    @Bean
    public Incident incident(){
        return new IncidentReport(author(), receiver());
    }

}
