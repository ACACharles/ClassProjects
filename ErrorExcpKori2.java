package errors;

public class ErrorExcp {

	static int a = 0;
	static int b = 2;
	static int c;
	static String str = "This will straight mess things up";
	static int[] arrg = new int[2];

	public static void main(String[] args) {
		try { 
			for(int i = 0; i<=3; i++) {
				//if (i==0) { c = b/a;}
				//if (i==1) { c = str;}
				if (i==2) { c = arrg[100];}
			}	}catch (ArithmeticException e){
				System.out.println("You hit a divide by zero error");
				return;
			}catch (NumberFormatException f){
				System.out.println("You can't assign a string to an integer");
			}catch (ArrayIndexOutOfBoundsException g){
				System.out.println("Your array doesn't have that index");
			}finally {
				System.out.println("Finally made it through all the errors");
				return;
			}
	}
}




