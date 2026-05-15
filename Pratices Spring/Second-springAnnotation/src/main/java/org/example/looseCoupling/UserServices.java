package org.example.looseCoupling;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("UserServiceSms")

public class UserServices {
    NotificationServices notification ;

//    public UserServices() {
//    }
    @Autowired

    public UserServices(@Qualifier("smsNotificationServices") NotificationServices notification) {
        this.notification = notification;
    }

    public NotificationServices getNotification() {
        return notification;
    }

    public void setNotification(NotificationServices notification) {
        this.notification = notification;
    }

    public void notifyUser(String message){
    notification.send("Hello World");

}
}
