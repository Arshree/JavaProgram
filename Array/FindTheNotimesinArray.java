package Array;

public class FindTheNotimesinArray {

	public static void main(String[] args) {
		
		int a[]= {23,45,56,34,12,23,15,23,45,23};
		int count=0;
		
//		for(int x:a) {
//			if(x==45) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 12) {
				count++;
			}
		}
		System.out.println("no of the 23 in the array is: " + count);
	}
		

}
