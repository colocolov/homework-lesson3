package world;

public class Car {

    String typeOfEngine;
    double volumeOfEngine;
    String brand;

    public Car() { // defaul constructor
        // code
    }

    public Car(String type, String brand) { // overloaded constructor
        this.typeOfEngine = type;
        this.brand = brand;
    }

    public Car(String brand, String type, double volume) { // overloaded constructor
        this.brand = brand;
        this.typeOfEngine = type;
        this.volumeOfEngine = volume;
    }

    public void nameCar() {
        System.out.println("Brand: " + brand);
    }

    public void typeEngine() {
        System.out.println("Type of engine: " + typeOfEngine);
    }

    public void volumeEngine() {
        System.out.println("Volume of engine: " + volumeOfEngine);
    }
}

class DemoCar {

    public static void main(String[] args) {
        Car car = new Car("Lexus", "diesel", 2.5);
        car.nameCar();
        car.typeEngine();
        car.volumeEngine();
    }
}
