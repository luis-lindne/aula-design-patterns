public class SmsAdapter implements Notificacao {

    private final SmsExterno sms;

    public SmsAdapter(SmsExterno sms) {
        this.sms = sms;
    }

    @Override
    public void enviar(String mensagem) {
        sms.enviarSms(mensagem);
    }
}