package assignment;

public class Swapping2Nos {

	public static void main(String[] args) {
		
//		int a = 13;
//		int b = 11;
//		System.out.println("Befor Swapping no's a=" + a + ", b="+b);
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("Afer Swapping no a=" +a + ", b="+b);
		
		int row = 5;
		
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
			System.out.print(" ");
			
			}
		
			int num = 1;
		for(int k=1; k<=i; k++)
		{
			System.out.print(num +" ");
			num++;
		}
			System.out.println();
		}
	}

}
