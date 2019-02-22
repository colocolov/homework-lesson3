package world;

public class Clock {

    String type, brand;

    public Clock() { // defaul constructor
        // code
    }

    public Clock(String type, String brand) { // overloaded constructor
        this.type = type;
        this.brand = brand;
    }

    public void typeClock() {
        System.out.println("Name: " + type);
    }

    public void brandClock() {
        System.out.println("Brand of clock: " + brand);
    }
}

class DemoClock {

    public static void main(String[] args) {
        Clock clock = new Clock("Цифровые", "Casio");
        clock.typeClock();
        clock.brandClock();

    }
}
