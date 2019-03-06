package human_resources;

public class Programmer {

    String name, surname, street;
    int yearOfBirth, numberHouse, numberApartment;
    long idPerson;

    public Programmer() { //default constructor
        System.out.println("Default constructor");
    }

    public Programmer(String surname) { //construct with 1 parametr
        this.surname = surname;
    }

    public Programmer(String surname, int year) { //construct with 2 parametr
        this(surname);
        this.yearOfBirth = year;
    }

    public Programmer(String surname, String name, int year) { //construct with 3 parametr
        this(surname, year);
        this.name = name;
    }

    public Programmer(String surname, String name, int year, long id) { //construct with 4 parametr
        this(surname, name, year);
        this.idPerson = id;
    }

    public void show() {
        System.out.println("Surname: " + surname + ". Name: " + name + ". Age: " + yearOfBirth + ". IDNP: " + idPerson);
    }

    public void show2() {
        displayAge();
    }

    public void displaySurname() {
        System.out.println("Surname is: " + surname);
    }

    public void displayName() {
        System.out.println("Name is: " + name);
    }

    public void displayAge() {
        System.out.println("Year of birth is: " + yearOfBirth);
    }

    public void displayId() {
        System.out.println("IDNP is: " + idPerson);
    }

}

class PersonDemo {

    public static void main(String[] args) {
        Programmer person = new Programmer();
        Programmer personWithNameAndSurname = new Programmer("Doe", "John", 29, 2002001012);
        person.show();
        System.out.print("\n");
        personWithNameAndSurname.show();
        personWithNameAndSurname.displayName();
        personWithNameAndSurname.show2();
    }
}
