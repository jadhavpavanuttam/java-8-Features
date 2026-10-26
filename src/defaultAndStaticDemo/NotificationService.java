package defaultAndStaticDemo;
interface NotificationService {
    void send(String message);

    default void sendWelcomeMessage() {
        send("Welcome to our application!");
    }
}
