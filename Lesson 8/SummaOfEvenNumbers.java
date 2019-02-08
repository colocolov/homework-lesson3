import java.util.Scanner;


	public class SummaOfEvenNumbers{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: podsciot cetnyh cisel do cisla vvedenogo polizovatelem.");
			
			//ввод данных от пользователя
			System.out.println("\nEnter your value: ");
			Scanner reader = new Scanner(System.in);
			int valueUser = reader.nextInt();
			
			int summa = 0; // инициализируем переменную summa и присваиваем ей значение 0
			System.out.println("\nValue: ");
			//рассчет суммы всех четных чисел до ввеного числа пользователем
			for (int valueInc = 0; valueInc <= valueUser; valueInc++)	{
				if (valueInc % 2 > 0){					
						continue;
					}
					summa = summa + valueInc;
					System.out.print(valueInc + " ");
			}
			

					System.out.println("\nYour summa of value: " + summa);
			
		}
	}