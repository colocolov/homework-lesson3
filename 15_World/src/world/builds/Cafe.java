package world.builds;

public class Cafe {

    String tip;
    String name;

    public Cafe() { // defaul constructor
        // code
    }

    public Cafe(String tip, String name) { // overloaded constructor
        this.tip = tip;
        this.name = name;
    }

    public void nameCafe() {
        System.out.println("Name: " + name);
    }

    public void tipCafe() {
        System.out.println("Tip of cafe: " + tip);
    }
}

class DemoCafe {

    public static void main(String[] args) {
        Cafe cafe = new Cafe("pizzeria", "Andy's Cafe");
        cafe.tipCafe();
        cafe.nameCafe();
    }
}
