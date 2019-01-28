import java.util.Scanner;

public class CalcSegmentation{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("\nCalcSegmentation");
		System.out.println("Author: Colocolov Stanislav");
		System.out.println("Description: eto microkal'kulator, kotoryi delit tol'ko tselye cisla.");
		
		//ввод первого числа
		System.out.println("\nEnter first value:");
		Scanner number = new Scanner(System.in);
		int firstValue = number.nextInt(); 
		
		//ввод второго числа
		System.out.println("\nEnter second value:");
		int secondValue = number.nextInt();
		number.close();
		
		//выполнение умножения
		float result = firstValue / secondValue;
		int resultInt = firstValue / secondValue;
		
		//вывод результата
		System.out.println("\nYour result is " + result);
		System.out.println("\nYour int result is " + resultInt);
		System.out.println("\n Bue!");
		
	}
}