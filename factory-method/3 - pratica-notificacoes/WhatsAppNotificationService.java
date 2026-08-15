// ConcreteCreator: fabrica notificações por WhatsApp (desafio adicional).
// Única classe nova de "criador" exigida; NotificationService e as demais
// classes existentes não foram alteradas.
public class WhatsAppNotificationService extends NotificationService {

    @Override
    protected Notification createNotification() {
        return new WhatsAppNotification();
    }
}
