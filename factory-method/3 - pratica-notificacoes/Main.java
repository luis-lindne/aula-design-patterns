// Cliente: só conhece NotificationService (abstrata) e Notification (abstrata).
// Nunca faz "new EmailNotification()" nem usa if/else para escolher o tipo.
public class Main {

    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        emailService.sendNotification("Your order has been shipped!");

        NotificationService smsService = new SmsNotificationService();
        smsService.sendNotification("Your order has been shipped!");

        NotificationService pushService = new PushNotificationService();
        pushService.sendNotification("Your order has been shipped!");

        // Desafio adicional: novo canal, mesmo fluxo de uso.
        NotificationService whatsAppService = new WhatsAppNotificationService();
        whatsAppService.sendNotification("Your order has been shipped!");
    }
}
