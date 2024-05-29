package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
	    int[] a= {34,645,372,73,56};
		/*Arrays.sort(a);
		
		System.out.println("After ascending order:");
		//for(int num : a)
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}*/
		System.out.println("Before sorting Arry");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sorting Array:");
		System.out.println(Arrays.toString(a));
	}

}
