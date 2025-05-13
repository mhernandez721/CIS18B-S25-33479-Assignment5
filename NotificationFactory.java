package notification;

public interface NotificationFactory<T> {
    // Lets us abstract the creation of a Notification<T>
    Notification<T> createNotification(T content);
}