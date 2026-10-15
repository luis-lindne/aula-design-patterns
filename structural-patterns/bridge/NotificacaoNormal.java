public class NotificacaoNormal extends Notificacao {

    public NotificacaoNormal(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensagem) {
        canal.enviar(mensagem);
    }
}