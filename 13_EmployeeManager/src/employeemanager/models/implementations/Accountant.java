package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Accountant extends Employee {

    //public String welcome = "Hello, I am a new programmer(accountant/manager)";
    public void calculate() {
        System.out.println("Accountant: calculate.");
    }
    
    @Override   /*аннотация. компилятор проверит реально ли вы сделали override. 
                * если нам важно знать сделали ли мы override приавильно, то надо это использовать
                * компилятор проверит - и если нет, то выдаст ошибку  */
    public void work() { //мы ovverride этот метод с класса Employee
        super.work(); // это сохранение оригинального метода из класса Employee. что-то типо this
        calculate();
    }
}

class AccountantDemo {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();

        Accountant acc = new Accountant();
        acc.work();
    }
}
