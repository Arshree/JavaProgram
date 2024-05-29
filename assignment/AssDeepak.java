package assignment;

public class AssDeepak {

	public static void main(String[] args) {
		String s ="tommorrow";
		char[] chars = s.toCharArray();
		for (int i=0;i<chars.length;i++)
		{
			if(chars[i] == 'o') {
			System.out.println(chars[i]);
		}
		else 
		{
			int count = 1;
			while(i + count<chars.length && chars[i + count] == 'o')
			{
				System.out.println('@');
				count++;
			}
			i += count-1;
		}
	}

}
}