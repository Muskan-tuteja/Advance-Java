package tightcoupling;

public class UserServices {
    NotificationServices notification = new NotificationServices();
public void notifyUser(String message){
    notification.send("Hello World !! ");
}
}
