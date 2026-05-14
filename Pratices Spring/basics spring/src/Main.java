import lossecoupling.EmailNotificationServices;
import lossecoupling.NotificationServices;
import lossecoupling.SmsNotificationServices;
import tightcoupling.UserServices;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
UserServices userServices = new UserServices();
userServices.notifyUser("Hello order placesd!");


//loose email interface
NotificationServices emailServices = new EmailNotificationServices();
lossecoupling.UserServices userServices2 = new lossecoupling.UserServices(emailServices);
userServices2.notifyUser("Hello order placesd!");
// losse sms interfaces
        NotificationServices smsServices = new SmsNotificationServices();
        lossecoupling.UserServices userServices3 = new lossecoupling.UserServices(smsServices);
    userServices3.notifyUser("Hello order placesd!");

   // loose setterinjection

        lossecoupling.UserServices userServicesSetter = new lossecoupling.UserServices();
        userServicesSetter.setNotification(emailServices);

        // loose field injection
//        userServicesSetter.getNotification=emailServices;
    }


}