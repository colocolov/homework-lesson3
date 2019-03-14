import java.util.Scanner;

	public class SummaOfValue{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: podsciot summy vheh cisel do cisla vvedenogo polizovatelem.");
			
			Scanner reader = new Scanner(System.in);
			boolean isAppEnabled = true;
			while(isAppEnabled){

			System.out.println("- Please choose an option:");
			System.out.println("1. Enter your value for calculate sum");
			System.out.println("2. Quit");
				
				int option = reader.nextInt();
				
				switch (option) {
				case 1: {

						//ввод данных от пользователя
						System.out.println("\nEnter your value: ");
						int valueUser = reader.nextInt();
						
						int summa = 0; // инициализируем переменную summa и присваиваем ей значение 0
						//рассчет суммы всех чисел до ввеного числа пользователем
						for (int valueInc = 0; valueInc <= valueUser; valueInc++)	{
							summa = summa + valueInc;
							
							//System.out.println("Your summa: " + summa); // проверка ввывода переменной summa
							//System.out.println("Your value: " + valueInc);  // проверка ввывода внутренней переменной цикла (инкремента)
							
								if (valueInc == valueUser){
									System.out.println("Your summa of value: " + summa);
								}
						}		
				}
				case 2: {
					isAppEnabled = false;
				}
				}
							
			}
		}
	}