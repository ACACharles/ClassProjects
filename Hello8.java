 /* 
	Final Review.
	I chose not to implement formatting suggestion. I chose println after asking for user name 
	to establish a feeling of dialogue between user and developer. Thank you for the input.
	-Keith

 */
 
 //This is Drew reviewing file Hello8.java
import java.util.Scanner;
public class Hello8{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		//Could make println into print so that the input is on the same line as the question
		System.out.println("What is your name?");
		//Sets userName as the user input
		String userName = input.nextLine();
		//Prints out the user input as well as the included strings
		System.out.println("Hello " + userName + "." + " My name is Keith.");
	}
}