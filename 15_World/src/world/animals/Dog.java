package world.animals;

public class Dog {

    String name, breed;

    public Dog() { // defaul constructor
        // code
    }

    public Dog(String name, String breed) { // overloaded constructor
        this.name = name;
        this.breed = breed;
    }

    public void nameDog() {
        System.out.println("Name: " + name);
    }

    public void breedDog() {
        System.out.println("Breed of dog is: " + breed);
    }

    public void barkDog() {
        System.out.println("The dog is bark!");
    }
}

class DemoDog{
    public static void main(String[] args) {
        Dog dog = new Dog("Beem", "Спаниель");
        dog.barkDog();
        dog.nameDog();
    }
}