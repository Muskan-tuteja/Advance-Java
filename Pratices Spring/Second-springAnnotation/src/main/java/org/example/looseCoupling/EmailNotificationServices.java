package org.example.looseCoupling;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("Email:" + message);
    }
}
