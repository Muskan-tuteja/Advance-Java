package org.example.looseCoupling;



public class UserServices {
    NotificationServices notification ;

    public UserServices() {
    }

    public UserServices(NotificationServices notification) {
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
