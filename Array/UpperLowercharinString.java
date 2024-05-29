package Array;

public class UpperLowercharinString {

	public static void main(String[] args) {
		String input = "WeLCome AuTomAtioN TesTing";

		int uppercaseCount=0;
		int lowercaseCount=0;

		for(int i=0; i<input.length(); i++){
		char c =input.charAt(i);
		if(Character.isUpperCase(c)){
		uppercaseCount++;
		}
		else if(Character.isLowerCase(c))
				{
		lowercaseCount++;
		}}
		System.out.println("Upper Cases are: " +uppercaseCount);
		System.out.println("Lower cases are: " +lowercaseCount);
		

	}

}
