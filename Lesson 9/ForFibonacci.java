import java.util.Scanner;


	public class ForFibonacci{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: vyvod cisel Fibonacci ciklom for.");
			
			Scanner reader = new Scanner(System.in);
			System.out.println("\nHow many Fibonacci numbers to print: ");
			int valueUser = reader.nextInt();
				
			int count1 = 0;
			int count2 = 1;
			int sum = 0;
			
			if (valueUser == 1){
				System.out.print(count1);
			}if (valueUser == 2){
				System.out.print(count1 + " " + count2);
			}else{
				for (int i = 0; i < valueUser - 2; i++) {
					if (i == 0 ){
						System.out.print(count1 + " " + count2);
					}
					sum = count1 + count2;
					count1 = count2;
					count2 = sum;
					System.out.print(" " + sum);
				}
			}
 		

		}
	}