package notification;

public class SmsObserver implements Observer<String> {
    private final String number;

    public SmsObserver(String number) {
        this.number = number;
    }

  
    public void update(Notification<String> notification) {
        // Simulates sending an SMS to the user
        System.out.println("[SMS] To: " + number + " | Msg: " + notification.getContent());
    }
}
