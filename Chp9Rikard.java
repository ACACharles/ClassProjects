package MyWork;

import java.util.InputMismatchException;

public class Chp9Rikard {

	public static void main(String[] args) {
		
		int str1 = 0;	
		int numer[] = {4, 8, 16, 32, 64, 128, 256};
		int denom[] = {2, 0, 4, 4, 0, 8};


		for(int i= 0; i <numer.length; i++) {
			try {
				System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i]/denom[i]);
			}
			catch(ArithmeticException ae) {
				System.out.println("Can not divide by zero. ");
			}
			catch (ArrayIndexOutOfBoundsException aiob) {
				System.out.println("Matching elements not found ");
			}
		}

		try {
			//int str1 = 0;
			//String srt2 = str1;
			String str2 = Integer.toString(str1);
		}
		catch (InputMismatchException imm){
			System.out.println(" You can't assign a string into a integer. ");
		}
		System.out.println("Expections practice program complete!");

	}
}
