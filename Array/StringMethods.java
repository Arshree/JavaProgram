package Array;

public class StringMethods {

	public static void main(String[] args) {
		
	/*	int[] a= {5,6,8,9};
		int s = 0;
		int s1 = 0;
		
		for(int i=0;i<a.length;i++) {
			s = s+a[i];
		}
		System.out.println("Sum of the array: " +s);
		
		for (int i=5; i<=9;i++) {
			s1=s1+i;
		}
		System.out.println("Sum of the array2 is: " +s1);
		System.out.println("Missing no is:" +(s1-s));*/
		
		
		String s ="arun";
		String s1=" angadi ";
		String s2="ARUN";
		
		System.out.println("Concatinate of both string: " +s.concat(s1));
		System.out.println("Length of string is: " +s1.length());
		System.out.println("After removing space: " +s1.trim().length());
		
		System.out.println(s.contains("ru"));
		System.out.println(s.contains("ga"));
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s1.replace('a','d'));
		
		System.out.println(s.substring(1,4));
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

}
