package notification;

public class NotificationBuilder<T> {
    private T content;

    // Allows chaining
    public NotificationBuilder<T> setContent(T content) {
        this.content = content;
        return this;
    }

    public Notification<T> build(NotificationFactory<T> factory) {
        // Could validate content here if needed
        return factory.createNotification(content);
    }
}
