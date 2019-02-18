package cars.models;

import cars.parts.Engine;

public class Car {
    
    int numberOfWheels;
    int numberOfDoors;
    String name;
    String subModel;
    Engine engine;
    
    boolean isStarted = false;
    
    
    void startEngine(){
        isStarted = true;
    }
    
    void run(){
        consumeFuel();
    }
    
    void consumeFuel(){
        
    }
    
    public void present(){
        System.out.println("Info: Name " + name + "Submodel: " + subModel 
                + "Number of wheels" + numberOfWheels + "Numbes of doors" + numberOfDoors);
    }
    
    
    
}
