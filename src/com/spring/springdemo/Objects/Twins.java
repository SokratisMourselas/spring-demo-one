package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Shop;
import org.springframework.stereotype.Component;

@Component
public class Twins implements Shop {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Twins() {
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

    @Override
    public String getContactDetails() {

        return "Shop Name: " +name + "\nAddress: "+ address +  "\nEmail: "+ email + "\nPhone: "+ phoneNumber;
    }
}
