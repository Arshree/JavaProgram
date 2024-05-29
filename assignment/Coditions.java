package assignment;

public class Coditions {

	public static void main(String[] args) {
//		int a = 10, b=20; //largest 3 no's
//		short a = 32767;
//		System.out.println(a);
		/*if(a>b || a>c)
		{
			System.out.println("A is greter then B & C:" +a);
		}
		else if(b>a || b>c)
		{
			System.out.println("B is greter then A & C:" +b);
		}
		else
		{
			System.out.println("C is greter then A & B:" +c);
		}
		*/
		
		/*if (a<b && a<c)
		{
			System.out.println("A is smaller then B & C");
		}
		else if(b<c && b<a)
		{
			System.out.println("B is smaller then A & C");
		}
		else 
		{
			System.out.println("C is smaller then A & B");
		}*/
		
//		String s = (a>b) ? "A is largest no" : "B is largest no";
//		System.out.println(s);
		
//		int weekno = 50;
//		
//		switch (weekno)
//		{
//		case 1: System.out.println("Sunday");
//		break;
//		case 2: System.out.println("Monday");
//		break;
//		case 3: System.out.println("Tuesday");
//		break;
//		case 4: System.out.println("Wednesday");
//		break;
//		case 5: System.out.println("Thursday");
//		break;
//		case 6: System.out.println("Friday");	
//		break;	
//		case 7: System.out.println("Saturday");	
//		break;
//		default: System.out.println("Invalide no");
//		}
		
//		String weekname = "Monday";
		
		/*switch (weekname) {
		case "Monday": System.out.println("No of the weekname is: 2");
		break;
		case "Tuesday" : System.out.println("No of the weekname is: 3");
		break;
		case "Wednesday" : System.out.println("No of the weekname is:4");
		break;
		case "Thursday" : System.out.println("No of the weekname is:5");
		break;
		case "Friday": System.out.println("No of the weekname is:6");
		break;
		case "Saturday": System.out.println("No of the weekname is:7");
		break;
		case "Sunday": System.out.println("No of the weekname is:1");
		break;
		defualt: Syso*/
		
		String s = "Entertainment";
		System.out.println("Vowel in the String \"" + s + "\":");
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
		if(isVowel(ch) ) {
			System.out.print(ch + " ");
		}
		
	}

	}
	
	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch) != -1;
	}
}
