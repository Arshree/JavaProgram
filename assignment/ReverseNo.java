package assignment;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int num = 122;
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no:");
		int num=sc.nextInt();*/
//		int rev = 0;
		
/*		while(num!=0)
		{
			rev = rev*10 + num%10;
			num =num/10;
		}*/
		
		//Using StringBuffer class
/*		StringBuffer s = new StringBuffer(String.valueOf(num));
		StringBuffer rev = s.reverse();*/
		
		//Using StringBuilder class
		StringBuilder s = new StringBuilder();
		 s.append(num);
		 StringBuilder rev = s.reverse();
		System.out.println(rev);
		
	}

}
