package world.around;

public class Street {

    boolean isTree;
    String name;
    int index;

    public Street() { // defaul constructor
        //code
    }

    public Street(String name, int index) { // overloaded constructor
        this.name = name;
        this.index = index;
    }

    public Street(String name, int index, boolean tree) { // overloaded constructor
        this.name = name; 
        this.index = index;
        this.isTree = tree;
    }

    public void nameStreet() {
        System.out.println("Name street: " + name);
    }

    public void indexStreet() {
        System.out.println("Number street: " + index);
    }

    public void treeOnStreet() {
        if (isTree == true) {
            System.out.println("There are trees on the street!");
        } else {
            System.out.println("No trees ((");
        }
    }
}

class DemoStreet {

    public static void main(String[] args) {
        Street street = new Street("Пушкина", 25, true);
        street.nameStreet();
        street.indexStreet();
        street.treeOnStreet();
    }
}
