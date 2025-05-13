package notification;

public class EmailNotification extends Notification<String> {
    public EmailNotification(String content) {
        super(content); // Just pass the message content up
    }
}
