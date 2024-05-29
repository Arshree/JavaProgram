package Array;

import java.util.*;
import java.util.Scanner;

public class InputofKeyBoard {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter No:");
		int num1 = sc.nextInt();
		System.out.println("Your no is:" +num1);
		
		System.out.println("Enter your 2nd num:");
		int num2 = sc.nextInt();
		System.out.println("Your 2nd no is:" +num2);
		
		System.out.println("Sum of your no is:" +(num1+num2));
		
		System.out.println("Enter name:");
		String s=sc.next();
		
		System.out.println("Your name is:" +s);*/
		
		
		String rev="";
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter String:");
		        String s = sc.next();

		        for(int i=s.length()-1;i>=0;i--){
		            rev = rev+s.charAt(i);
		            
		        }
		        if(s.equals(rev)){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }
		

	}

}
