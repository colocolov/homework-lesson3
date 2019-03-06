package world.around;

public class Station {

    String name, type;
    int index;

    public Station() { // defaul constructor
        // code
    }

    public Station(String name, String type) { // overloaded constructor
        this.name = name;
        this.type = type;
    }

    public void nameStation() {
        System.out.println("Name: " + name);
    }

    public void typeStation() {
        System.out.println("Station is: " + type);
    }
}

class DemoStation {

    public static void main(String[] args) {
        Station station = new Station("ул. Пушкина", "Тролейбусб автобус");
        station.nameStation();
        station.typeStation();
    }
}
