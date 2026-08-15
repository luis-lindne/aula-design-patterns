// ConcreteProduct: envio por WhatsApp (desafio adicional).
// Só foi necessário criar esta classe nova; nada mais no sistema precisou mudar.
public class WhatsAppNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}
