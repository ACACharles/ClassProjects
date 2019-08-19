/*

This is Zackery review file Hello6

*/

//Importing scanner for user input
import java.util.Scanner;

class Hello6
{
	public static void main( String [] args)
	{
	//Greeting
		Scanner input = new Scanner(System.in);
	System.out.println( "Hey guy");
	
	//Asks user and promts them to write their name
	System.out.print ( "What is your name: " );
		String name = input.next();
		
		System.out.println (" Thanks, " + name);
		
		System.out.println (" Hello, I am Hello6.");
	
	
	}

}