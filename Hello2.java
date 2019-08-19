/*
This is Marcus reviewing file Hello2
*/

package help;  //what's this do?

import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		// looks good
		System.out.println("Hello User. What is your name?");
		Scanner name = new Scanner(System.in);
		String x = name.next();
		// still looking good
		System.out.println("Hello " + x + ". My name is Kori.");
	}
}
		// fin
