import java.util.Scanner;
public class hello1 {
	
	public static void main(String args[]) {
		
		String devname = "1";
			
			Scanner input = new Scanner ( System.in );
			System.out.println("What is your name?");
		String username = input.nextLine();
			System.out.println("Thank you!");
			System.out.println("Hello " + username + "!");
			
			System.out.println("Hello my name is "+ devname + "!");
	}
}
