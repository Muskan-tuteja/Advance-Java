package lossecoupling;

public class SmsNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification Service : " + message);
    }
}
