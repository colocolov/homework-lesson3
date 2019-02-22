package human_resources;

public class Salesman {

    String name, surname, street;
    int yearOfBirth, idPerson, numberHouse, numberApartment;

    public Salesman() { //default constructor
        //code
    }

    public Salesman(String surname) { //construct with 1 param
        this.surname = surname;
    }

    public Salesman(String surname, int year) { //construct with 2 param
        this.surname = surname;
        this.yearOfBirth = year;
    }

    public Salesman(String surname, String name, int year) { //construct with 3 param
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = year;
    }

    public Salesman(String surname, String name, String street, int numberHouse) { //construct with 4 param
        this.surname = surname;
        this.name = name;
        this.street = street;
        this.numberHouse = numberHouse;
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
        displayStreet();
        displayNumberHouse();
    }
}

class SalesmanDemo {

    public static void main(String[] args) {
        Salesman buyer = new Salesman("Doe", "John", "Valey", 25);
        buyer.show();
    }
}
