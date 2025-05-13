package notification;

public class main {
    public static void main(String[] args) {
        // Setup observers
        EmailObserver emailUser = new EmailObserver("jane.doe@example.com");
        SmsObserver smsUser = new SmsObserver("+19876543210");

        // Notification manager
        NotificationService<String> service = new NotificationService<>();
        service.registerObserver(emailUser);
        service.registerObserver(smsUser);

        // Build and send email
        NotificationBuilder<String> builder = new NotificationBuilder<>();
        Notification<String> emailNotif = builder.setContent("Hey Jane, welcome!").build(new EmailNotificationFactory());
        service.sendNotification(emailNotif);

        // Build and send SMS
        Notification<String> smsNotif = builder.setContent("Your package is out for delivery!").build(new SmsNotificationFactory());
        service.sendNotification(smsNotif);

        // Type erasure explanation
        TypeErasureDemo.demo(emailNotif);


    }
}
