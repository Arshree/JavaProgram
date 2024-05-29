package Array;

public class FindTheNotimesinArray {

	public static void main(String[] args) {
		
		int a[]= {23,45,56,34,12,23,15,23,45,23};
		int count=0;
		
		for(int x:a) {
			if(x==45) {
				count++;
			}
		}
		System.out.println(count);
	}

}
