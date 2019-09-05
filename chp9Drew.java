package bleh;

public class chp9Drew {
	public static void main(String args[]) {
		int[] x= {2,0};
		
		int div=0;
		int bound=0;
		int notstr;
		String str="This is a string";
		for(int i=0; i<3;i++) {
			
			try {
			div=x[0]/x[i];
			
 
			notstr=Integer.parseInt(str);

			
			System.out.print(div+bound+notstr);
			}catch(ArithmeticException e) {
				System.out.println("Exception caught: "+e);
				System.out.println("\n");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught: "+e);
				System.out.println("\n");
			}catch(NumberFormatException e) {
				System.out.println("Exception caught: "+e.toString());
				System.out.println("\n");
			}
			
		}
	}
}
