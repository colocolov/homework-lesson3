package world.around;

public class Tree {

    boolean isGreen;
    String type;
    int height;

    public Tree() { // defaul constructor
        //code
    }

    public Tree(String type, int height) {   // overloaded constructor
        this.type = type;
        this.height = height;
    }

    public Tree(String type, int height, boolean tree) { // overloaded constructor
        this(type, height);
        this.isGreen = tree;
    }

    public void typeTree() {
        System.out.println("Type: " + type);
    }

    public void heightTree() {
        System.out.println("Height: " + height + "m");
    }

    public void treeGreen() {
        if (isGreen == true) {
            System.out.println("The tree is green!");
        } else {
            System.out.println("The tree is not green.");
        }
    }
}

class DemoTree {

    public static void main(String[] args) {
        Tree tree = new Tree("Сосна", 5);
        tree.typeTree();
        tree.heightTree();
        tree.treeGreen();
    }
}
