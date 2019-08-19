/* 
This is Cody reviewing file Hello10

The program compiles and runs; it doesn't ask me for my name before I enter my name. 
*/
import java.util.Scanner ;

class Hello10
{
	public static void main (String [] args)
	{
		Scanner name = new Scanner(System.in);
		
		String user = name.next();
		
		System.out.println ("What is your name?");
		
		System.out.println ( "Hello " + user + ", my name is Will.");
	}

}
// I like how everything looks 
// When I run the program it doesn't ask me what my name is. 
// I think that you can fix this by putting "System.out.println ("What is your name?");" before the "String user = name.next();"
