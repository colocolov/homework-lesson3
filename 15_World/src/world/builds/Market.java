package world.builds;

public class Market {

    String tip, name;

    public Market() { // defaul constructor
        // code
    }

    public Market(String tip, String name) { // overloaded constructor
        this.tip = tip;
        this.name = name;
    }

    public void nameMarket() {
        System.out.println("Name: " + name);
    }

    public void tipMarket() {
        System.out.println("Tip: " + tip);
    }
}

class DemoMarket {

    public static void main(String[] args) {
        Market market = new Market("minimarket", "Fidesco");
        market.tipMarket();
        market.nameMarket();
    }
}
