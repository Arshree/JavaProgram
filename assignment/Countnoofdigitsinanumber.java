package assignment;

public class Countnoofdigitsinanumber {

	public static void main(String[] args) {
		
		int num=123434566;
		int count=0;
		
		while(num > 0) {
			
			num = num/10;
			count++;
		}
		System.out.println("No of digits in num " +count);
		
	}

}
