package world.auto;

public class Motorcycle {

    String brand;
    int price;
    double capacity;

    public Motorcycle() { // defaul constructor
        //code
    }

    public Motorcycle(String brand, int price) {   // overloaded constructor
        this.brand = brand;
        this.price = price;
    }

    public Motorcycle(String brand, int price, double capacity) {   // overloaded constructor
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
    }

    public void brandMotorcycle() {
        System.out.println("Brand: " + brand);
    }

    public void priceMotorcycle() {
        System.out.println("Price: " + price + "$");
    }

    public void capacityMotorcycle() {
        System.out.println("Capacity: " + capacity + " m3");
    }
}

class DemoMotorcycle {

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Honda", 2500, 1.3);
        motorcycle.brandMotorcycle();
        motorcycle.priceMotorcycle();
        motorcycle.capacityMotorcycle();
    }
}
