package notification;

public class EmailObserver implements Observer<String> {
    private final String email;

    public EmailObserver(String email) {
        this.email = email;
    }

 
    public void update(Notification<String> notification) {
        // Simulates sending an email to the user
        System.out.println("[EMAIL] To: " + email + " | Message: " + notification.getContent());
    }
}
