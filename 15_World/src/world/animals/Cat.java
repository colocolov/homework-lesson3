package world.animals;

public class Cat {

    String name, breed;

    public Cat() { // defaul constructor
        // code
    }

    public Cat(String name, String breed) { // overloaded constructor
        this.name = name;
        this.breed = breed;
    }

    public void nameCat() {
        System.out.println("Name: " + name);
    }

    public void breedCat() {
        System.out.println("Breed of cat is: " + breed);
    }
}

class DemoCat {

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Дворняга");
        cat.nameCat();
        cat.breedCat();
    }
}
