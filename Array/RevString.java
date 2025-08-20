package Array;

public class RevString {

	public static void main(String[] args) {
		
/*		String str = "Arun";
		String reversed = reverseString();
		System.out.println("Original String" + str);
		System.out.println("After Reverse" + reversed);
	}
	
	public static String reverseString(Sting str)
	{
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = str.length() -1;
		while(start < end)
		{
			char temp = charArray[start];
			
		}*/

//		char[] charArray = str.toCharArray();
//		int length = charArray.length;
//		
//		for (int i=0; i<length/2; i++)
//		{
//			char temp = charArray[i];
//			charArray[i] = charArray[length - i - 1];
//			charArray[length -i - 1] = temp;
//		}
//		String reversedStr = new String(charArray);
//		System.out.print("Reversed string: " + reversedStr);
		
//		{
//	        String str = "hello";
//	        StringBuilder reversedStr = new StringBuilder(str).reverse();
//	        System.out.println("Reversed string: " + reversedStr);
//		}
//		     String str = "hello";
//		        String reversedStr = reverseString(str);
//		        System.out.println("Reversed string: " + reversedStr);
//	        }
//		
//		public static String reverseString(String str) {
//	        // Base case: if the string is empty or has only one character, return it
//	        if (str.isEmpty() || str.length() == 1) {
//	            return str;
//	        }
//	        // Recursive call: reverse the substring starting from the second character and append the first character
//	        return reverseString(str.substring(1)) + str.charAt(0);
		
//		String str = “Pankaj�?;
//		StringBuffer sf = new StringBuffer(s);
//		System.out.print(sf.reverse());
		
//		String str = "Arun";
//		String reversed=reverseString(str);
//		System.out.println("Reversed string:" + reversed);
//	}
//
//	public static String reverseString(String str) {
//		if (str.isEmpty() || str.length() == 1) {
//		return str;
//	}
//		return reverseString(str.substring(1)) + str.charAt(0);
//    }
		
		
		/*main----*/
		String a = "arun";
		//	a = a.replace(" ", "");
			String rev = "";
			for (int i = a.length() - 1; i >= 0; i--)
				rev = rev + a.charAt(i);
			System.out.println(rev);
//			{
//			if( a.equals(rev)) {
//				System.out.println("Given string is polyndrom :" + rev);
//			}
//			else {
//				System.out.println("Given string is not polyndrom");
//			}
		}

	}
//}
