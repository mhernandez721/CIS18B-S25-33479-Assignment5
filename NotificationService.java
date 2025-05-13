package notification;

import java.util.*;

public class NotificationService<T> {
    private final List<Observer<T>> observers = new ArrayList<>();

    public void registerObserver(Observer<T> observer) {
        observers.add(observer); // Add the observer to the list
    }

    public void sendNotification(Notification<T> notification) {
        // Loop through all observers and notify them
        for (Observer<T> obs : observers) {
            obs.update(notification);
        }
    }
}
