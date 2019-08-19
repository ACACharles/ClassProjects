/*

This is Will reviewing file Hello5.
DOES IT WORK ('YES'/NO)
*/

import java.util.Scanner;
class HelloFive {
	
	public static void main(String[] args){
	
	String myName = "Cody";
	Scanner input = new Scanner (System.in);
	
	
	System.out.println(" What is your name? ");
	String name = input.next();
		
	System.out.println("Hello " + name + " my name is " + myName);
		

	}
}