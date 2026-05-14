package lossecoupling;



public class UserServices {
    NotificationServices notification ;

    public UserServices(NotificationServices notification) {
        this.notification = notification;
    }

    public void notifyUser(String message){
    notification.send("Hello World");
}
}
