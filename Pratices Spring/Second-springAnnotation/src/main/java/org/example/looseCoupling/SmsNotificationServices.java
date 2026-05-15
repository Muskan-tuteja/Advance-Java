package org.example.looseCoupling;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification Service : " + message);
    }
}
