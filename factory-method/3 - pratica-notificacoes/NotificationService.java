// Creator: conhece apenas a abstração Notification.
// createNotification() é o Factory Method: fica a cargo das subclasses
// decidir qual produto concreto será instanciado.
public abstract class NotificationService {

    protected abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
