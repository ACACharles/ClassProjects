
public class tryzackery {
	
	public static void main(String args[]) {
		
			int num1[] = {2, 4, 9, 3, 0, 10};
			int num2[] = {1, 0, 7, 8};
			String number = "This is my string, there are many like it. ";
			
			for(int i=0; i<number.length(); i++) {
				try { 
					System.out.println(num1[i] / num2[i]);
				}
				catch(ArithmeticException || ArrayIndexOutOfBoundsException || Throwable) {
					System.out.println();
				}

				}
}
