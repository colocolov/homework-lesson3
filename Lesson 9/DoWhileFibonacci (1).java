import java.util.Scanner;


	public class DoWhileFibonacci{
		
		public static void main(String[] args){
			
			//описание
			System.out.println("Author: Colocolov Stanislav");
			System.out.println("Description: vyvod cisel Fibonacci ciklom while.");
			
			Scanner reader = new Scanner(System.in);
			System.out.println("\nEnter your value: ");
			int valueUser = reader.nextInt();
				
			int count1 = 0;
			int count2 = 1;
			int sum = 0;
			int count0 = 1;
			
			do{
				    System.out.print(count1 + " ");
                	sum = count1 + count2;
					count1 = count2;
					count2 = sum;
					
					count0 ++;
			}
			
			while (count0 <= valueUser);		

		}
	}