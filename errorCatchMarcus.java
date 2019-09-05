package CB;


public class errorCatchMarcus {
	public static void main(String args[]) {
int nums1[] = {4, 6, 7, 9, 32, 11};
int nums2[] = {3, 0, 5, 1};




	for (int i=0; i<nums1.length; i++) {
		try {
		System.out.println(nums1[i] + " / " + nums2[i] + " is " + nums1[i]/nums2[i]);
		
		System.out.println();
		}
	
		
	catch(ArrayIndexOutOfBoundsException exc) {
		System.out.println("You gotta be quicker than that");
		System.out.println();
		return;
	} 
		
	
	catch(ArithmeticException exc) {
		System.out.println("Can't divide by zero");
		System.out.println();
	}
	finally {
		System.out.println("i like them french fried taters..");
		System.out.println();
	}

	}
}

}
	
	
	
	

