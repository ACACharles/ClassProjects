package DividesByZeroExercise;

public class DividesByZero extends Exception
{	int n;
	int d;
	
	DividesByZero(int i, int j)
{	n = i;
	d = j;
	}
	public static void main(String[] args)
	
	
	
	{	int nums[] = new int[4];
	
	try 
	{
	
	System.out.println("Before exception is generated.");
			
	nums[7] = 10;
	
	System.out.println("this won't be displayed.");
	}
	catch (ArrayIndexOutOfBoundsException exc) 
	{
	System.out.println("Standard message is");
	System.out.println(exc);
	System.out.println("\nStack trace: ");	
	System.out.println("Index out-of-bounds.");
	exc.printStackTrace();
	System.out.println("After catch statement.");
	}
	{
	int numer[] = {4,8,16,24,45,64,128};
	int denom[] = {2,0,4,4,0,8,9};
	
	for (int i=0; i<numer.length; i++)
	{
		try
		{ System.out.println (numer[i] + "/" + denom[i] + " is " + numer[i]/denom[i]);
		
		}
			catch (ArithmeticException exc)
		{
				System.out.println("Can't divide by Zero!");
		}
	
	}
	}
	}
}
