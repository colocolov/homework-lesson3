import java.util.Scanner;

public class CalcTip{
	
	public static void main(String[] args){
		
		//описание
		System.out.println("Author: Colocolov Stanislav");
		System.out.println("Description: programa dlea opredelenia tipa cisla.");
		
		//ввод числа
		System.out.println("\nEnter value:");
		Scanner number = new Scanner(System.in);
		int value = number.nextInt(); 
		number.close();
		
		//выполнение умножения
		int tip = value % 2;
		System.out.println ("Znacenie ostatka" + tip);
		
		if(tip == 0){
			System.out.println("\nCislo cetnoe.");
		}
		else{
			System.out.println("\nCislo necetnoe.");
		}

	}
}