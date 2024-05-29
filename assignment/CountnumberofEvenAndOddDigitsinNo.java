package assignment;

public class CountnumberofEvenAndOddDigitsinNo {

	public static void main(String[] args) {
		
		int num = 123456;
		int temp =0;
		int even =0;
		int odd = 0;
		
		while(num>0) 
		{
			temp=num%10;
			
			if(temp%2==0) 
			{
				
				even++;
			}
			else {
				
				odd++;
	
			}
			num = num/10;
		}
			System.out.println(even);
			System.out.println(odd);

	}

}
