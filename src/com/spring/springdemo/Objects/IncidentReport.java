package com.spring.springdemo.Objects;

import com.spring.springdemo.Objects.People.Author;
import com.spring.springdemo.Objects.People.Receiver;
import com.spring.springdemo.interfaces.Incident;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class IncidentReport implements Incident {

    private int uniqueId;

    @Value("${dummy.projectName}")
    private String projectName;

    @Value("${dummy.directedTo}")
    private String directedTo;

    @Value("${dummy.messageBody}")
    private String messageBody;

    @Value("${default.implementationState}")
    public String implementationState;

    private Author author;
    private Receiver receiver;

    @Override
    public String toString() {
        return "IncidentReport{" +
                "\nuniqueId=" + uniqueId +
                "\n, projectName='" + projectName + '\'' +
                "\n, directedTo='" + directedTo + '\'' +
                "\n, messageBody='" + messageBody + '\'' +
                "\n, author='" + getAuthorName() +", "+ author.getRole()+
                "'\n}";
    }

    @Override
    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String getReceiverName() {
        return receiver.getName();
    }

    @Override
    public String getImplementationState() {
        return implementationState;
    }

    @Override
    public void setImplementationState(String implementationState) {
        this.implementationState = implementationState;
    }

    public IncidentReport(Author author, Receiver receiver) {
        this.author = author;
        this.receiver = receiver;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDirectedTo() {
        return directedTo;
    }

    public void setDirectedTo(String directedTo) {
        this.directedTo = directedTo;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void setReceiverName(String name){
        receiver.setName(name);
    }
}
