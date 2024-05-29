package Array;

public class StringPresentInArray {

	public static void main(String[] args) {
		
		String s[] = {"ABC", "XYZ", "FGH"};
		String s1 ="XYz";
		boolean flag = false;
		
		for(int i=0;i<s.length-1;i++) {
			if(s[i].equals(s1)) {
				System.out.println("String is present in array");
				flag = true;
				break;
			}
			
		}
			if(flag==false) {
			System.out.println("String is not present in array");}
	}

}
