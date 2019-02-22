package human_resources;

public class Bookkeeper {

    String name, surname, street;
    int yearOfBirth, idPerson, numberHouse, numberApartment;

    public Bookkeeper() { //default constructor
        //code
    }

    public Bookkeeper(String surname) { //construct with 1 param
        this.surname = surname;
    }

    public Bookkeeper(String surname, int year) { //construct with 2 param
        this.surname = surname;
        this.yearOfBirth = year;
    }

    public Bookkeeper(String surname, String name, int year) { //construct with 3 param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
    }

    public Bookkeeper(String surname, String name, int year, String street) { //construct with 4 param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
        this.street = street;
    }

    public Bookkeeper(String name, String surname, int year, int id, String street, int numberHouse, int numberApartment) { //construct with all param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
        this.idPerson = id;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberApartment = numberApartment;
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
        System.out.print("Street: " + street);
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
        displayIdPerson();
        displayStreet();
        displayNumberHouse();
        displayNumberApartment();
    }
}

class BookkeeperDemo {

    public static void main(String[] args) {
        Bookkeeper person = new Bookkeeper("Doe", "John", 29, 2002001234, "Valey", 25, 3);
        person.show();
    }
}
