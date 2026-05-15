package org.example.demo;


import org.example.looseCoupling.NotificationServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class lifeCycleBean {
    private NotificationServices notification;

    public lifeCycleBean(@Qualifier("emailNotificationServices") NotificationServices notification) {
        System.out.println("Constructing bean in injected");
        this.notification = notification;
    }
    public void init(){
        System.out.println("init called : bean in injected");
    notification.send("Hello World!! life cycle bean");
    }
    public void perfromTask(){
        System.out.println("Ready for use");
    }
    public void cleanup(){
        System.out.println("cleanup called");
    }
}
