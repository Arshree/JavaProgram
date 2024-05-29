package Array;

public class SearchAnElement {

	public static void main(String[] args) {
		
		int a[]= {23,45,78,20,23,23};
		int se_num=23;
		boolean value=false;
		
		for(int x:a) {
			if(x==se_num) 
			{
				value=true;
				System.out.println("No is found");
				break;
			}
		}
		if(value=false) {
		System.out.println("No is not found");
		}
	}

}
