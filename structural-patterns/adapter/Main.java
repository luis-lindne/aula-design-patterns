public class Main {

    public static void main(String[] args) {
        Notificacao email = new EmailService();
        NotificacaoService serviceEmail = new NotificacaoService(email);
        serviceEmail.notificar("Pedido aprovado!");

        SmsExterno smsExterno = new SmsExterno();
        Notificacao sms = new SmsAdapter(smsExterno);

        NotificacaoService serviceSms = new NotificacaoService(sms);

        serviceSms.notificar("Pedido aprovado!");

    }
}
