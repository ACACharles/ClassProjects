class fun
{	
	

	public static void main(String [] args)
	{
			try{
		int nums [] = new int [7];
		
		String noFun = new String();
		
		nums [9] = 12;
		
		//nums[5] = "andrew";
		
		//noFun = 2345;
		
		int nums1 = 100 / 0;
		
			}
			catch(ArrayIndexOutOfBoundsException aiob)
			{
				System.out.println(" Index is out of bounds. ");
			} 
			catch(ArithmeticException ae)
			{
			System.out.println("Cannot divide by zero.");	
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Not a valid input.");
			}
			/*catch(Exception name)
			{
				System.out.println(name); 
			}
*/			catch(IllegalArgumentException iae)
			{
				System.out.println("Wrong.");
			} 
			finally
			{
				System.out.println("Most errors have been caught");
			}
			
		 
		
	}
}