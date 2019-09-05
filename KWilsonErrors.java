import java.util.InputMismatchException;

public class KWilsonErrors{

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		String str = "Some string";
		int[] arr = new int[5];
		String x = "";
		try {
		str += Integer.parseInt(str);
		System.out.println(arr[8]);
		c = a / b;
		}
		catch (ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException ex) {
			x = ex.toString();
		}
		finally {
			System.out.println("All errors have been caught. Error was: " + x);
		}
	}
}