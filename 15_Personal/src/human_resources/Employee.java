package human_resources;

/**
 * работа в классе
 */
public class Employee {

    private String name;
    private String surname;
    private int age;

    public Employee() {
        System.out.println("Employee; Default constructor called");
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        // this.name = name;
        // this.surname = surname;
        this(name, surname); // вызываем второй конструктор. И ОН ДОЛЖЕН БЫТЬ ПЕРВЫМ ПЕРЕД ВСЕМ ОСТАЛЬНЫМ КОДОМ
        this.age = age;
    }
}  
    
class EmployeeDemo{
        public static void main(String[] args){
            
        }
    }

