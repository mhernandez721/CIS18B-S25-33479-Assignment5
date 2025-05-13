package notification;

public interface Observer<T> {
    // Called when a new notification is available
    void update(Notification<T> notification);
}
