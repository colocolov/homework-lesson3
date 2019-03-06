package world.builds;

public class Home {

    String type;
    int qLevel;

    public Home() { // defaul constructor
        // code
    }

    public Home(String type, int level) { // overloaded constructor
        this.type = type;
        this.qLevel = level;
    }

    public void typeOfHome() {
        System.out.println("Home is: " + type);
    }

    public void levelHome() {
        System.out.println("Levels of house is: " + qLevel);
    }
}

class DemoHome {

    public static void main(String[] args) {
        Home home = new Home("Многоквартирный", 2);
        home.typeOfHome();
        home.levelHome();
    }
}
