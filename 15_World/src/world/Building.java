package world;

public class Building {

    int qLevels;
    String name;

    public Building() { // defaul constructor
        // code
    }

    public Building(int levels, String name) { // overloaded constructor
        this.qLevels = levels;
        this.name = name;
    }

    public void nameBuild() {
        System.out.println("Name of build: " + name);
    }

    public void levelsOfBuild() {
        System.out.println("Levels of build: " + qLevels);
    }

    public void show() {
        nameBuild();
        levelsOfBuild();
    }
}

class DemoBuild {

    public static void main(String[] args) {
        Building build = new Building(11, "MallDova Hotel");
        build.show();
    }
}
