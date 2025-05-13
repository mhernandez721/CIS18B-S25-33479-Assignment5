package notification;

public abstract class Notification<T> {
    private final T content;

    public Notification(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
