package Array;

public class ArrayEquals {

	public static void main(String[] args) {
		
		int[] a = {1,3,2,4,5};
		int[] b= {4,5,6,7,2};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second largest number is:" +a[1]);
	}

}
