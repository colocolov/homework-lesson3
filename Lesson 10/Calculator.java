import java.util.Scanner;


	public class Calculator{
	
		public static void main(String[] args){
			
			// 1. User input
	/*		Scanner keybordScanner = new Scanner(System.in);
			System.out.println ("Please enter square side length:");
			int squareSide = keybordScanner.nextInt();
			// 2. Calculate perimetr
			int perimetr = squareSide * 4;
			// 3. Calculate surface
			int surface = squareSide * squareSide;
			// 4. Display the result
			System.out.println ("Square > Surface: " + surface + " / Perimetr: " + perimetr);
			
			// 5. Calculate rectangle
			System.out.println ("\nPlease enter rectange side length:");
			System.out.println ("Length:");
			int length = keybordScanner.nextInt();
			System.out.println ("Width:");
			int width = keybordScanner.nextInt();
			int rectPerimetr = (width + length) * 2;
			int rectSurface = length * width;
			System.out.println ("Rectange > Surface: " + rectSurface + " / Perimetr: " + rectPerimetr);
	*/		
			// 6. 
			System.out.println("\nPlease enter your value for compate odd or even: ");
			int oddOrEven = keybordScanner.nextInt();
						/* другое решение 
						if (oddOrEven % 2 == 0){
							// even
						} else {
							// odd
						}
						*/			
			System.out.println ("Result: " + oddOrEven + " is " + (oddOrEven % 2 == 0 ? "even" : "odd"));
		}
	
	}