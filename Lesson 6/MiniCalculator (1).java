import java.util.Scanner;

public class MiniCalculator{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("\nName: Calculator");
		System.out.println("Author: Colocolov Stanislav");
		System.out.println("Description: eto mini kal'kulator, kotoryi delit tol'ko tselye cisla.");
		
		Scanner scanner = new Scanner(System.in);
		boolean isAppEnables = true;
		while(isAppEnables){
			
		//ввод первого числа
		System.out.println("\nEnter first value:");
		int firstValue = scanner.nextInt(); 
		
		//ввод второго числа
		System.out.println("\nEnter second value:");
		int secondValue = scanner.nextInt();
		
		//ввод операции над числами
		System.out.println("\nEnter operation + - * / %:");
		String action = scanner.next();
		
			//
			switch(action) {
			   case "+" :
					int slojenie = firstValue + secondValue;
					System.out.println("\nYour result is: " + slojenie);
				  break; 
			   case "-" :
					int vicitanie = firstValue - secondValue;
					System.out.println("\nYour result is: " + vicitanie);
				  break; 
				case "*" :
					int umnojenie = firstValue * secondValue;
					System.out.println("\nYour result is: " + umnojenie);
				  break; 
				case "/" :
					int delenie = firstValue / secondValue;
					System.out.println("\nYour result is: " + delenie);
				  break; 
				case "%" :
					int moduli = firstValue % secondValue;
					System.out.println("\nYour result is: " + moduli);
				  break; 
				 default : System.out.println("You entered the wrong operation.");
			} // end switch

		System.out.println("Repeat again? (Y/N)");
		String repeatOperation = scanner.next();
			if(repeatOperation == "N"){
					isAppEnables = false;
			}	
		} // end while
		
		System.out.println("\n Bye!");
		
	}
}