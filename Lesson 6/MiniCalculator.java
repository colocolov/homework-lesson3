import java.util.Scanner;

public class MiniCalculator{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("\nName: Calculator");
		System.out.println("Author: Colocolov Stanislav");
		System.out.println("Description: eto mini kal'kulator, kotoryi delit tol'ko tselye cisla.");
		
		//ввод первого числа
		System.out.println("\nEnter first value:");
		Scanner number = new Scanner(System.in);
		int firstValue = number.nextInt(); 
		
		//ввод второго числа
		System.out.println("\nEnter second value:");
		int secondValue = number.nextInt();
		number.close();
		
		//выполнение умножения
		int slojenie = firstValue + secondValue;
		int vicitanie = firstValue - secondValue;
		int umnojenie = firstValue * secondValue;
		int delenie = firstValue / secondValue;
		int moduli = firstValue % secondValue;
		
		//вывод результата
		System.out.println("\nYour result is:");
		System.out.println("\n+ : " + slojenie);
		System.out.println("- : " + vicitanie);
		System.out.println("* : " + umnojenie);
		System.out.println("/ : " + delenie);
		System.out.println("% : " + moduli);
		System.out.println("\n Bue!");
		
	}
}