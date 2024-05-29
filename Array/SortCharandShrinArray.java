package Array;

import java.util.Arrays;

public class SortCharandShrinArray {

	public static void main(String[] args) {
		
		//char a[]= {'A','S','C','Y'};
		String[] a= {"ABC", "xyz", "dfc", "trs"}; 
		
		System.out.println("Before Sorting array is :" + Arrays.toString(a));
		
			Arrays.sort(a);
			System.out.println("After sorting array is :" + Arrays.toString(a));

	}

}
