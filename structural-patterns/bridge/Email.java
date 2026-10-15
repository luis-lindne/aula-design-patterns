public class Email implements CanalEnvio {

    @Override
    public void enviar(String mensagem) {
        System.out.println(
                "Enviando por E-mail: " + mensagem
        );
    }
}