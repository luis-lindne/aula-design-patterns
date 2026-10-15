public class Chocolate
        extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calcularPreco() {
        return bebida.calcularPreco() + 3.0;
    }
}