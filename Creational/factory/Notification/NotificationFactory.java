public class NotificationFactory {
    public Notification getNotification(String type, String... params) {
        if (type == null) {
            throw new IllegalArgumentException("type can not be null");
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification(params[0], params[1]);
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification(params[0], params[1]);
        } else {
            throw new IllegalArgumentException("invalid notification type");
        }
    }
}
