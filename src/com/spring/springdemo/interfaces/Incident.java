package com.spring.springdemo.interfaces;

public interface Incident {

    String getAuthorName();

    String getReceiverName();

    String getImplementationState();

    void setImplementationState(String implementationState);

    void setReceiverName(String name);

}
