package Array;

public class RemoveNoNprintStrininString {

	public static void main(String[] args) {
		
		String s = "1A2r3u4n5";
		
		/*for(int i=0;i<=s.length()-1;i++) {
			 char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.print(c);
			}
			
		}*/
		
		/*String s1 = s.replace('A','s');
		System.out.println(s1);*/
		
		String s1=s.replaceAll("[^A-Z,a-z]","");
		System.out.println(s1);
		
	}

}
