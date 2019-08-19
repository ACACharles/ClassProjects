/*
	This is user 8 commenting on this code.
*/
// Imports the scanner class
import java.util.Scanner; 
class hello3
{
	public static void main(String[] args)
	
	{
		//Creates a new object named "input" from the Scanner class and calls upon the System.in method from that class.
		Scanner input = new Scanner(System.in);
		//Prompts the user for the desired input.
		System.out.print("Hello! What is your name?: ");
		//Accepts input from the user in the user in the form of a String that has been named "name".
		String name = input.nextLine();
		//Prints out to screen string literals concatonated with the user input.
		System.out.println("Hello " + name + ", my name is Drew.");
		
	}
}
/*
	Code executes as intended.
<<<<<<< HEAD
*/
=======
*/
//Final look by user 3
>>>>>>> 731567c892ca46837eaa9b0450269613348e2c13
