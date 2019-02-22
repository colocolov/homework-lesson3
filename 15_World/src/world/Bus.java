package world;

public class Bus {

    String brand;
    int number;

    public Bus() { // defaul constructor
        // code
    }

    public Bus(int number, String brand) { // overloaded constructor
        this.number = number;
        this.brand = brand;
    }

    public void brandBus() {
        System.out.println("Brand bus: " + brand);
    }

    public void numberOfBus() {
        System.out.println("Number of bus: " + number);
    }
}

class DemoBus {

    public static void main(String[] args) {
        Bus bus = new Bus(5, "Volvo");
        bus.brandBus();
        bus.numberOfBus();
    }
}
