
package calculator;

public class Algebra { // класс

    public void detectOddOrEven(int number) {       // метод
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println("Result: " + number + " is " + result);
        
        /* другое решение 
            if (oddOrEven % 2 == 0){
                    // even
            } else {
                    // odd
            }*/

    }
}
