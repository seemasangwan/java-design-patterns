public class SmsNotification implements Notification {
   private String phoneNumber;
   private String message;
    public SmsNotification(String phoneNumber,String message)
    {
        this.message=message;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void sendNotification()
    {
        System.out.println("send messgae to sms phonenumber "+phoneNumber+" messgae "+message);
    }
}
