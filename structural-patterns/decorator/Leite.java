public class Leite extends BebidaDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calcularPreco() {
        return bebida.calcularPreco() + 2.0;
    }
}