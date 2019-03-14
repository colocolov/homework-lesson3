package world.person;

public class Person {

    int age;
    String name, surname;

    public Person() { // defaul constructor
        // code
    }

    public Person(String name, String surname) { // overloaded constructor
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) { // overloaded constructor
        this(name, surname);
        this.age = age;
    }

    public void showNameSurname() {
        System.out.println("Name: " + name + ". Surname: " + surname);
    }

    public void showAge() {
        System.out.println("Age: " + age);
    }
}

class DemoPerson {

    public static void main(String[] args) {
        Person person = new Person("Mark", "Kolos", 2);
        person.showNameSurname();
        person.showAge();
    }
}
