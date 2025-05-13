package notification;

public class SmsNotificationFactory implements NotificationFactory<String> {
  
    public Notification<String> createNotification(String content) {
        return new SmsNotification(content); // Factory creates an SMS notification
    }
}
