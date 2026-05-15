package org.example.looseCoupling;


import org.springframework.stereotype.Component;

@Component
public class EmailNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("Email:" + message);
    }
}
