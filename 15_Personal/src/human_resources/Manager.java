package human_resources;

public class Manager {

    String name, surname, street;
    int yearOfBirth, idPerson, numberHouse, numberApartment;

    public Manager() { //default constructor
        //code
    }

    public Manager(String surname) { //construct with 1 param
        this.surname = surname;
    }

    public Manager(String surname, int year) { //construct with 2 param
        this.surname = surname;
        this.yearOfBirth = year;
    }

    public Manager(String surname, String name, int year) { //construct with 3 param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
    }

    public Manager(String surname, String name, int year, String street) { //construct with 4 param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
        this.street = street;
    }

    public void displayName() {
        System.out.println("Name is: " + name);
    }

    public void displaySurname() {
        System.out.println("Surname is: " + surname);
    }

    public void displayYearOfBirth() {
        System.out.println("Year of birth is: " + yearOfBirth);
    }

    public void displayIdPerson() {
        System.out.println("IDNP is: " + idPerson);
    }

    public void displayStreet() {
        System.out.println("Street: " + street);
    }

    public void displayNumberHouse() {
        System.out.println(" " + numberHouse);
    }

    public void displayNumberApartment() {
        System.out.println("Apartment: " + numberApartment);
    }

    public void show() {
        displayName();
        displaySurname();
        displayYearOfBirth();
        displayStreet();
    }
}

class ManagerDemo {

    public static void main(String[] args) {
        Manager manager = new Manager("Doe", "John", 29, "Valey");
        manager.show();
    }
}
