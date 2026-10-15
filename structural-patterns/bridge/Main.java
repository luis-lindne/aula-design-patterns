public class Main {

    public static void main(String[] args) {
        CanalEnvio email = new Email();
        Notificacao notificacao = new NotificacaoNormal(email);
        notificacao.enviar("Pedido aprovado!");
    }
}
