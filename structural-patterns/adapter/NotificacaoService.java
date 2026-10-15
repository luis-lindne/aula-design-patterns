public class NotificacaoService {

    private final Notificacao notificacao;

    public NotificacaoService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void notificar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}