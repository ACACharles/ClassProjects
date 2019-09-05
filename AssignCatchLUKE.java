package random;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCatchLUKE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 5 ; 
		 int k = 0; 
		  int data ; 
		 int [] myArray = {7, 4, 3, 2,}; 
		int l = 0 ;
		//String str  = String.ValueOf(l) ;
		
			
			
		try {
			data = j/k ; 
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("Arithmetic Exception");
		}
			catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("ArrayIndexOutOfBounds Exception");
		}
			  catch(Exception e)
		{
				  System.out.println("Parent Exception"); 
		}
					System.out.println("rest of the code");
		
		
		
		System.out.println("Elements in the array are: ");
		   System.out.println(Arrays.toString(myArray));
		    Scanner sc = new Scanner(System.in) ;
		     System.out.println("Enter the index of element greater than 3 :: ");
		    int element = sc.nextInt();
		   System.out.println(" Element in the given index is : " + myArray[element]);
		System.out.println(l);

			
				
			}
}
		



