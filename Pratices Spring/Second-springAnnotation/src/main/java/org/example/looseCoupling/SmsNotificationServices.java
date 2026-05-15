package org.example.looseCoupling;


import org.springframework.stereotype.Component;

@Component
public class SmsNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification Service : " + message);
    }
}
