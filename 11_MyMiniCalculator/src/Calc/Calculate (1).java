package Calc;

public class Calculate {

    public void additionCalc(int valueOne, int valueTwo) {
        int add = valueOne + valueTwo;
        System.out.println("Add: " + add);
    }

    public void subtractionCalc(int valueOne, int valueTwo) {
        int subtraction = valueOne - valueTwo;
        System.out.println("Subtraction: " + subtraction);
    }

    public void multiplicationCalc(int valueOne, int valueTwo) {
        int multiplication = valueOne * valueTwo;
        System.out.println("Multiplication: " + multiplication);
    }

    public void divisionCalc(int valueOne, int valueTwo) {
        int division = valueOne / valueTwo;
        System.out.println("Division: " + division);
    }

    public void remainderCalc(int valueOne, int valueTwo) {
        int remainder = valueOne % valueTwo;
        System.out.println("Remainder of division: " + remainder);
    }
}
