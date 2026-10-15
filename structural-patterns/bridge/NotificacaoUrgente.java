public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensagem) {
        canal.enviar("URGENTE: " + mensagem);
    }
}