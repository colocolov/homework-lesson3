package employeemanager;

import employeemanager.models.Employee;
import employeemanager.models.implementations.Accountant;
import employeemanager.models.implementations.Manager;
import employeemanager.models.implementations.Programmer;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here

        //Employee jake = new Employee();
        //Employee peter = new Employee();
        //System.out.println("jake == peter");
        //System.out.println(jake == peter);
        Manager manager = new Manager();
        System.out.println(manager.welcome);

        Programmer programmer = new Programmer();
        System.out.println(programmer.welcome);

        Accountant accountant = new Accountant();
        System.out.println(accountant.welcome);

    }

}
