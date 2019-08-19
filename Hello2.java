package help;

import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {

		System.out.println("Hello User. What is your name?");
		Scanner name = new Scanner(System.in);
		String x = name.next();

		System.out.println("Hello " + x + ". My name is Kori.");
	}
}
