public class EmailNotification implements Notification {
    private String email;
    private String message;
    public EmailNotification(String email,String message)
    {
        this.message=message;
        this.email=email;
    }

    @Override
    public void sendNotification()
    {
        System.out.println("send messgae to email " +email+" messgae "+message);
    }
}
