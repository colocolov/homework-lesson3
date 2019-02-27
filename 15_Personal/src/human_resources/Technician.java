package human_resources;

public class Technician {

    String name, surname, street;
    int yearOfBirth, idPerson, numberHouse, numberApartment;

    public Technician() { //default constructor
        //code
    }

    public Technician(String surname) { //construct with 1 param
        this.surname = surname;
    }

    public Technician(String surname, int year) { //construct with 2 param
        this(surname);
        this.yearOfBirth = year;
    }

    public Technician(String surname, String name, int year) { //construct with 3 param
        this(surname, year);
        this.name = name;
    }

    public Technician(String surname, String name, int id, int year) { //construct with 4 param
        this(surname, name, year);
        this.idPerson = id;
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

    public void displaNumberHouse() {
        System.out.println(" " + numberHouse);
    }

    public void displaNumberApartment() {
        System.out.println("Apartment: " + numberApartment);
    }

    public void show() {
        displayName();
        displaySurname();
        displayIdPerson();
        displayYearOfBirth();
    }
}

class TechnicianDemo {

    public static void main(String[] args) {
        Technician worker = new Technician("Doe", "John", 2002001234, 1990);
        worker.show();
    }
}
