
package calculator;

public class FIbonacciGenerator {

    public void generateFibonacciList(int count){
        int num1 = 0;
        int num2 = 1;
        int sum;
        for (int i = 1; i < count; i++) { 
                System.out.print(num1 + " ");
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                //System.out.print(" " + sum);
            }
        }
}
