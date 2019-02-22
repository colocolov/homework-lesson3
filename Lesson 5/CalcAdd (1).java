import java.util.Scanner;

public class CalcAdd{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("\nCalcAdd");
		System.out.println("Author: Colocolov Stanislav");
		System.out.println("Description: eto microkal'kulator, kotoryi skladyvaet tol'ko tselye cisla.");
		
		//ввод первого числа
		System.out.println ("\nEnter first value:");
		Scanner number = new Scanner (System.in);
		int firstValue = number.nextInt();;
		
		//ввод второго числа
		System.out.println ("\nEnter second value");
		int secondValue = number.nextInt();
		number.close();
		
		//выполнение сложения
		int result = firstValue + secondValue;
		
		//вывод результата
		System.out.println ("\nYour result is " + result);
		System.out.println("\n Bue!");
	}
}