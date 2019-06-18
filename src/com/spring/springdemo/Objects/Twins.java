package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Shop;
import com.spring.springdemo.interfaces.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Twins implements Shop {

    private String name = "Twins, Served with love";
    private String address = "Plastira 1, Drosia";
    private String email = "twins@twins-email.com";
    private String phoneNumber = "+30-210-813-5500";

    private Tables tables;

    public Twins() {
    }

    @Autowired
    public Twins(Tables tables) {
        this.tables = tables;
    }

    @Override
    public String getContactDetails() {
        return "Shop Name: " +name + "\nAddress: "+ address +  "\nEmail: "+ email + "\nPhone: "+ phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
