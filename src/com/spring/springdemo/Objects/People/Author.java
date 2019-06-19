package com.spring.springdemo.Objects.People;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author implements Person{

    private int authorUniqueId;

    @Value("${dummy.authorName}")
    private String name;

    @Value("${dummy.authorRole}")
    private String role;


    public int getAuthorUniqueId() {
        return authorUniqueId;
    }

    public void setAuthorUniqueId(int authorUniqueId) {
        this.authorUniqueId = authorUniqueId;
    }

    @Override
    public String getName() {
        System.out.println("<< Author.class >> Retrieving Author's name\n.\n..\n...");
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
