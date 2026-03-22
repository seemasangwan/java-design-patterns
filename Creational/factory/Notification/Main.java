import java.awt.image.DataBufferShort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification1 = notificationFactory.getNotification("sms", "2323", "sms message");
        Notification notification2 = notificationFactory.getNotification("email", "dff", "email message");
        notification1.sendNotification();
        notification2.sendNotification();
    }
}*/
public class Main {
    public static void main(String[] args) {
    DatabaseFactoryProvider factoryProvider=new DatabaseFactoryProvider();
    DatabaseFactory databaseFactory=factoryProvider.getDatabaseFactory("mongo");
    DatabaseConnection databaseConnection=databaseFactory.getDatabaseConnection();
    DatabaseQueryExecutor queryExecutor= databaseFactory.getDatabaseQueryExecutor();
    databaseConnection.createConnection();
    queryExecutor.executeQuery();
    }
}