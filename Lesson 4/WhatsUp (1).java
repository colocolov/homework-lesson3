import java.util.Scanner;

public class WhatsUp {
	
	public static void main(String[] args){
		//String version = System.getProperty("java.version");
		
		System.out.println("\nHello! Let's introduce!");
		
		System.out.println("\nWhat's your Name:");
		Scanner reader = new Scanner(System.in);
		String userName = reader.next();
		
		System.out.println("\nNice to meet you, " + userName + "!");
		System.out.println("\nI am Java!");
		
		System.out.println("\nWhat's your Surname: ");
		String userSurname = reader.next();
		
		System.out.println("\nAnd what do you do: ");
		String userWork = reader.next();
		reader.close();
		
		System.out.println("\nOk, " + userName + " " + userSurname + ".");
		System.out.println("\nI'm the programm. You are " + userWork + ". \nHave a nice day!");
 	}
}