package world.auto;

public class Bicycle {

    String brand;
    int price;

    public Bicycle() { // defaul constructor
        //code
    }

    public Bicycle(String brand, int price) {   // overloaded constructor
        this.brand = brand;
        this.price = price;
    }

    public void brandBicycle() {
        System.out.println("Brand: " + brand);
    }

    public void priceBicycle() {
        System.out.println("Price: " + price + "$");
    }
}

class DemoBicycle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Giant", 250);
        bicycle.brandBicycle();
        bicycle.priceBicycle();
    }
}
