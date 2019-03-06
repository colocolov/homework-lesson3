package world.person;

public class Family {

    int children;
    String name;

    public Family() { // defaul constructor
        // code
    }

    public Family(int qChildren, String name) { // overloaded constructor
        this.children = qChildren;
        this.name = name;
    }

    public void showQuantity() {
        System.out.println("Children(s) in this family: " + children);
    }

    public void showName() {
        System.out.println("Name of children: " + name);
    }
}

class DemoFamily {

    public static void main(String[] args) {
        Family family = new Family(1, "Mark");
        family.showQuantity();
        family.showName();
    }
}
