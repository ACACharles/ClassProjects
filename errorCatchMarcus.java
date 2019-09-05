package CB;

public class errorCatchMarcus {
	public static void main(String args[]) {
int nums1[] = {4, 6, 7, 9, 32, 11};
int nums2[] = {3, 0, 5, 0};
int b = 6;

String str1 = String.valueOf(b);

	for (int i=0; i<nums1.length; i++) {
		try {
		System.out.println(nums1[i] + " / " + nums2[i] + " is " + nums1[i]/nums2[i]);
		System.out.println(str1);
	}
	
		
	catch(ArrayIndexOutOfBoundsException exc) {
		System.out.println("You gotta be quicker than that");
	}
	catch(ArithmeticException exc) {
		System.out.println("Almost got it..");
	}	
	catch(Throwable exc) {
		System.out.println("I like them french fired taters..mhmm..");
	}
	
	}
	}

}