// final upload

import java.util.Scanner ;

class Hello10
{
	public static void main (String [] args)
	{
		Scanner name = new Scanner(System.in);
		
		System.out.println ("What is your name?");
		
		String user = name.next();
		
		System.out.println ( "Hello " + user + ", my name is Will.");
	}
}