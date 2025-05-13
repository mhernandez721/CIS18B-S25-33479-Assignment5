package notification;

public class SmsNotification extends Notification<String> {
    public SmsNotification(String content) {
        super(content); // Same as email, but could expand this later
    }
}
