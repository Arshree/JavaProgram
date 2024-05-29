package Array;

import java.util.Arrays;

public class MaxNoAnd2ndMaxinArray {

	public static void main(String[] args) {
	      int[] x={100,2,3,4,5,7};
	      int n = x.length;
//	      int max=x[0];      
//	    
//	    for(int i=1; i<x.length;i++){
//	        if(max < x[i]) {
//	        	x[i]=max-2;
//	        }
//	    }
//	      System.out.println(max);
	      
	      Arrays.sort(x);
	      System.out.println("Second Maxno is:" +x[n-2]);
	      
	}

}
