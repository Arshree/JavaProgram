package Array;

public class MissingArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,5};
		int s = 0;
		int s1=0;
		
		for(int i=0;i<a.length;i++) {
			s = s+a[i];
		}
		System.out.println("Sum of array: " + s);
		
		for(int j=0;j<=5;j++) {
			 s1=s1+j;
		}
		System.out.println("Sum of array2: " + s1);
		System.out.println("Missing array is:" +(s1-s));
		
		
	}

}
