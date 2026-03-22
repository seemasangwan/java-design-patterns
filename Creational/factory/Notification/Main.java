import java.awt.image.DataBufferShort;
public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification1 = notificationFactory.getNotification("sms", "2323", "sms message");
        Notification notification2 = notificationFactory.getNotification("email", "dff", "email message");
        notification1.sendNotification();
        notification2.sendNotification();
    }
}
