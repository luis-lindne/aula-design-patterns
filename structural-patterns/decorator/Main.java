public class Main {

    public static void main(String[] args) {
        Bebida cafe = new Cafe();

        cafe = new Leite(cafe);
        cafe = new Chocolate(cafe);

        System.out.println(
                cafe.calcularPreco()
        );
    }
}
