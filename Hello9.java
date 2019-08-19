import java.util.Scanner;
public class Hello9 {

	public static void main ( String[] args ){
		
		Scanner input = new Scanner ( System.in );
		System.out.print("What is your name? : ");
		
		String user = input.nextLine() ;
		
		System.out.println( "Hello " + user + " My name is Brian." );
		
	}
	
	
}