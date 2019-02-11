package calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner keybordScanner = new Scanner(System.in);
        
        // 1. Square = perimetr + surface
        Geometry geometry = new Geometry();
 /*       System.out.println("Please enter square side: ");
        int squareSide = keybordScanner.nextInt();
        geometry.calculateSquareSurface(squareSide);
        int perimetr = geometry.calculateSquarePerimetr(squareSide);
        System.out.println("Perimetr " + perimetr);
        // Rectange = --//--

        // 2. even or odd
        System.out.println("\nPlease enter your value for compate odd or even: ");
        int number = keybordScanner.nextInt();
        Algebra algebra = new Algebra();
        algebra.detectOddOrEven(number);
       
        // 3. Fibonacci
        System.out.println("\nHow many Fibonacci numbers to print: ");
        int count = keybordScanner.nextInt();
        FIbonacciGenerator fibonacciGenerator = new FIbonacciGenerator();
        fibonacciGenerator.generateFibonacciList(count);
        System.out.println(" ");
        
        // 4. Rectangle = perimetr + surface
        System.out.println ("\nPlease enter rectangle side length:");
        System.out.print ("Length: ");
        int lengthRectangle = keybordScanner.nextInt();
        System.out.print ("Width: ");
        int widthRectangle = keybordScanner.nextInt();
        geometry.calculateRectanglePerimetr(widthRectangle, lengthRectangle);
        geometry.calculateRectangeSurface(widthRectangle, lengthRectangle);
        
        // 5. Rhombus = perimetr + surface
        //Geometry geometry = new Geometry(); // НАДО ЛИ ЕЩЕ РАЗ ЭТО ОБЪЕВЛЯТЬ?
        System.out.println("\nPlease enter phombus side: ");
        int phombusSide = keybordScanner.nextInt();
        geometry.calculateRhombusPerimetr(phombusSide); 
        System.out.println("\nPlease enter phombus height: ");
        int phombusHeight = keybordScanner.nextInt();
        geometry.calculateRhombusSurface(phombusSide, phombusHeight);
 */       
        // 6. Triangle = perimetr + surface       
        System.out.println("\nPlease enter three sides of triangle: ");
        int aSide = keybordScanner.nextInt();
        int bSide = keybordScanner.nextInt();
        int cSide = keybordScanner.nextInt();
        geometry.calculateTrianglePerimetr(aSide, bSide, cSide);
        geometry.calculateTriangleSurface(aSide, bSide, cSide);
        
    }

}
