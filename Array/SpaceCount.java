package Array;

public class SpaceCount {

	public static void main(String[] args) {
		
		String s =" a r u n s n k ";
		
		int a = s.length();
		
		int b = s.replace(" ","").length();
		
		System.out.println(a-b);
		

	}

}
