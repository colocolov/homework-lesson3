import java.util.Scanner;


	public class Exponent{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: podsciot stepeni cisla vvedenogo polizovatelem.");
			
			//ввод данных от пользователя
			System.out.println("\nEnter your value: ");
			Scanner reader = new Scanner(System.in);
			int valueUser = reader.nextInt();
			
			int intExponent = 1; // инициализируем переменную присваиваем ей значение 1
			//рассчет суммы всех четных чисел до ввеного числа пользователем
					
				for (int valueInc = 1; valueInc <= valueUser; valueInc++)	{
						intExponent = intExponent * valueInc;
						
				}
			
			System.out.println("\nYour exponent of value is: " + intExponent);
			
		}
	}