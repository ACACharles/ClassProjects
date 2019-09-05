package bleh;

public class chp9Drew {
	public static void main(String args[]) {
		int[] x= {2,0};
		
		int div=0;
		int bound=0;
		int notstr;
		String str="This is a string";
		String z="";
		for(int i=0; i<3;i++) {
			
			try {
			div=x[0]/x[i];
			
 
			notstr=Integer.parseInt(str);

			
			System.out.print(div+bound+notstr);
			}catch(ArithmeticException |ArrayIndexOutOfBoundsException | NumberFormatException e) {
				z=e.toString();
			}finally {
				System.out.println("The following error was caught: "+z+" :in for loop roation "+i+"\n");
			}
			
		}
	}
}
