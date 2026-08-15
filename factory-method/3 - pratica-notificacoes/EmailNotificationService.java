// ConcreteCreator: fabrica notificações por e-mail.
public class EmailNotificationService extends NotificationService {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
