/*

This is CHARLES reviewing file hello1.java
DOSE IT WORK (YES/ NO) it better work
*/
import java.util.Scanner;
public class hello1 {
	
	public static void main(String args[]) {
		
//creates a string named "DEVNAME"
		String devname = "1";
//Creates a new instance of Scanner call 'input' that is grabing info from "system.in"			
			Scanner input = new Scanner ( System.in );
//Promts the user for their name
			System.out.println("What is your name?");
//Creates an String to save username.... 
//not grouped with the rest of variables created
		String username = input.nextLine();

//thanks the user
			System.out.println("Thank you!");
//talks to user
// Changed final Print line, makes more sense this way
			System.out.println("Hello " + username + ", my name is "+ devname + "!");

	}
			
}

//Final Copy, Zackery Fox
