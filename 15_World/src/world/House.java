package world;

public class House {

    String location;
    int numberHouse, qRoom;

    public House() { // defaul constructor
        // code
    }

    public House(String location, int number) { // overloaded constructor
        this.location = location;
        this.numberHouse = number;
    }

    public House(String location, int number, int rooms) { // overloaded constructor
        this.location = location;
        this.numberHouse = number;
        this.qRoom = rooms;
    }

    public void nameStreet() {
        System.out.println("Your houser on street: " + location);
    }

    public void numberHouse() {
        System.out.println("Number of house is: " + numberHouse);
    }

    public void quantRooms() {
        System.out.println("Quantity of rooms: " + qRoom);
    }
}

class DemoHouse {

    public static void main(String[] args) {
        House house = new House("Dacia", 30, 3);
        house.nameStreet();
        house.numberHouse();
        house.quantRooms();
    }
}
