package Day3;

public class Operaters {
	public static void main(String args[])
	{	
	int a=20, b=10;
	
	int res = a+b;
	System.out.println("Sum of the A and B is:" +res);
	System.out.println("Sub of the A and B is:" +(a-b));
	System.out.println("Mul of the A and B is:" +(a*b));
	System.out.println("Div of the A and B is:" +(a/b));
	System.out.println("Modulo Div of the A and B is:" +(a%b));
	
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	
	b = 20;
	System.out.println(a<=b);
	System.out.println(a>=b);
	
	boolean result=a>b;
	System.out.println(result);
	
	System.out.println(a==b);
	System.out.println(a!=b);
	
	boolean x = true;
	boolean y = false;
	
	System.out.println(x && y);
	System.out.println(x || y);
	System.out.println(!x);
	System.out.println(!y);
	
	System.out.println((10<20) && (20>10));
	
	
	}
}
