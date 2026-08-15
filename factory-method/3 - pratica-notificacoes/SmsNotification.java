// ConcreteProduct: envio por SMS.
public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
