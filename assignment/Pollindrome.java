package assignment;

public class Pollindrome {

	public static void main(String[] args) {
		int num = 1221;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your no:");
//		int num=sc.nextInt();
		int rev = 0;
		int origin =num;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num =num/10;
			
		}
		
		if(rev == origin) {
		System.out.println("Given no is Pollindrome");
		}
		else {
			System.out.println("No is not Pollindrome");
		}
	}

	}
