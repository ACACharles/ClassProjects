package errors;

public class ErrorExcp {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int c;
		String str = "This will straight mess things up";
		int[] arrg = new int[2];

		try {
			for(int i = 0; i<=3; i++) {
				if (i==0) { c = b/a;}
				//if (i==1) { c = str;}
				if (i==2) { c = arrg[100];}
			}
		}catch (ArithmeticException e){
			System.out.println("You hit a divide by zero error");
			return;
		}catch (NumberFormatException f){
			System.out.println("You can't assign a string to an integer");
			return;
		}catch (ArrayIndexOutOfBoundsException g){
			System.out.println("Your array doesn't have that index");
			return;
		}finally {
			System.out.println("Finally made it through all the errors");
			return;
		}
	}
}
