package com.spring.springdemo.Objects;

import com.spring.springdemo.interfaces.Shop;
import org.springframework.stereotype.Component;

@Component
public class Twins implements Shop {


//    value="Twins, Served with love"/>-->
//    value="Plastira 1, Drosia"/>-->
//    value="twins@twins-email.com"/>-->
//    value="+30 210 813 5500"/>-->
    private String name = "Twins, Served with love";
    private String address = "Plastira 1, Drosia";
    private String email = "twins@twins-email.com";
    private String phoneNumber = "+30-210-813-5500";

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
