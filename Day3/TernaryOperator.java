package Day3;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String args[])
	{
		int x = 13;
//		Scanner sc = new Scanner(System.in); 
//		int x = sc.readIndex()
		//variable=expression ? result1(retun result1) : result2;
//		String x = (person_age>=18) ? "Eligible" : "Not_Eligible";
//		System.out.println("Given age is:" +x);
		
		String y = (x % 2 == 0) ? "Even no" : "Odd no";
		System.out.println("Given no is:" +y);
	}

}
