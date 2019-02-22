//import java.util.Scanner;

public class CalcVariable{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("\nCalc Variable");
		System.out.println("Author: Colocolov Stanislav");
				
		//вывод числа
		System.out.println("\nValue a = 5");
		
		//присвайвание меременной 'а' значение
		int a = 5;
		
		//вывод расчета
		System.out.println("Calc b = ++a * 2 - a-- + a++ + --a + ++a * a--");
		int b = ++a * 2 - a-- + a++ + --a + ++a * a--;
				
		//вывод результата
		System.out.println("\nYour result: b = " + b);
		System.out.println("\n Bye!");
		
	}
}