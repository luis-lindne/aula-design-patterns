public class Main {

    public static void main(String[] args) {

        Logistics logistics = new Logistics();

        // Entrega terrestre
        Transport truck = new Truck();
        logistics.planDelivery(truck);

        // Entrega marítima
        Transport ship = new Ship();
        logistics.planDelivery(ship);
    }

}