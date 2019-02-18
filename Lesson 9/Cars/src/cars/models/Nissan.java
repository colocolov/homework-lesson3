package cars.models;

public class Nissan extends Car {

    /**
     * Default constructor.
     */
    public Nissan() { // это конструктор
        System.out.println("Nissan consructor is called");
        name = "Nissan";
        numberOfWheels = 4;
        numberOfDoors = 5;
    }
    
    /**
     * Parameterized construcotr
     * @param model 
     */
    public Nissan(String model){
        subModel = model;
    }

    public void runVeryFast() {
        consumeFuel();
        consumeFuel();
    }
    
    
}
