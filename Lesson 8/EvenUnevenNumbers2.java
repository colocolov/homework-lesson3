import java.util.Scanner;


	public class EvenUnevenNumbers2{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: podsciot cetnyh i necetnyh cisel.");
			
			//ввод данных от пользователя
			System.out.println("\nEnter 10 value: ");
			Scanner reader = new Scanner(System.in);
			int userValue1 = reader.nextInt();
			int userValue2 = reader.nextInt();
			int userValue3 = reader.nextInt();
			int userValue4 = reader.nextInt();
			int userValue5 = reader.nextInt();
			int userValue6 = reader.nextInt();
			int userValue7 = reader.nextInt();
			int userValue8 = reader.nextInt();
			int userValue9 = reader.nextInt();
			int userValue10 = reader.nextInt();
			
			int[] array = {userValue1, userValue2, userValue3, userValue4, userValue5, userValue6, userValue7, userValue8, userValue9, userValue10};
			
			
			int quantityUneven = 0; // объевляем переменную, в которой будет храниться кол-во нечетных чисел
			int quantityEven = 0;
			
			System.out.println("\nYour 10 values are: " + userValue1 + " " + userValue2 + " " + userValue3 + " " + userValue4 + " " + userValue5 + " " + userValue6 + " " + userValue7 + " " + userValue8 + " " + userValue9 + " " + userValue10);
			
			//рассчет количества всех четных и нечетных чисел
			for (int i:array){
			if (i % 2 > 0){
						quantityUneven += 1;
					} else{
						quantityEven += 1;
					}
			}

				System.out.println("\nYour quantity uneven values is: " + quantityUneven);
				System.out.println("\nYour quantity even values is: " + quantityEven);
			
		}
	}