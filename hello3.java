//imports scanner

import java.util.Scanner; 

//names class
class hello3
{
	//main methond
	public static void main(String[] args)
	
	{
		//names scanner input
		Scanner input = new Scanner(System.in);
		
		//prints Hello what is your name
		System.out.print("Hello! What is your name?: ");
		
		//prompts input for name
		String name = input.nextLine();
		
		//prints input for name
		System.out.println("Hello " + name + ", my name is Drew.");
		
	}
}
