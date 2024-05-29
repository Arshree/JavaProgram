package Array;

public class EvenOddofArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		
//		int evn =0;
//		int odd =0;
		
		System.out.println("Even no's are:");
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]%2==0) 
				System.out.println(a[i]);
		}
		System.out.println("Odd no's are:");
			for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==1)
			 
				System.out.println(a[i]);
			}
		}

	}


