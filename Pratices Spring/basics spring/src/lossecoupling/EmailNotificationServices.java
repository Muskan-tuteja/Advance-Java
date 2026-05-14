package lossecoupling;

public class EmailNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("Email:" + message);
    }
}
