package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Shop;
import com.spring.springdemo.interfaces.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Twins implements Shop {

    private int numberOfVisitors = 0;

    private String name = "Twins, Served with love";
    private String address = "Plastira 1, Drosia";
    private String email = "twins@twins-email.com";
    private String phoneNumber = "(+30) 210 813-5500";

    private Tables tables;

    public Twins() {
        System.out.println(">> Twins.class: inside the default constructor");
    }

//    @Autowired
//    public Twins(Tables tables) {
//        this.tables = tables;
//    }

    @Autowired
    @Qualifier("randomTables")
    public void setTables(Tables tables) {
        System.out.println(">> Inside setTables() method");
        this.tables = tables;
    }

    @Override
    public String getContactDetails() {
        return "Shop Name: " +name + "\nAddress: "+ address +  "\nEmail: "+ email + "\nPhone: "+ phoneNumber +
                "\nNumber of Available Tables: "+ tables.getNumberOfTables();
    }

    @Override
    public int getNumberOfTablesOnly() {
        return tables.getNumberOfTables();
    }

    @Override
    public int getNumberOfVisitors() {
        numberOfVisitors++;
        return numberOfVisitors;
    }
}
