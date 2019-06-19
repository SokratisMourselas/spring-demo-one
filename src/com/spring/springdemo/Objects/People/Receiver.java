package com.spring.springdemo.Objects.People;

import org.springframework.stereotype.Component;

@Component
public class Receiver implements Person{

    private int receiverUniqueId;
    private String name;
    private String role;


    public int getReceiverUniqueId() {
        return receiverUniqueId;
    }

    public void setReceiverUniqueId(int receiverUniqueId) {
        this.receiverUniqueId = receiverUniqueId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
