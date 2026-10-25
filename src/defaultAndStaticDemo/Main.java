package defaultDemo;

class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService service = new EmailNotification();
        service.sendWelcomeMessage();
    }
}
