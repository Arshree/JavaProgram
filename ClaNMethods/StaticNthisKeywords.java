package ClaNMethods;

public class StaticNthisKeywords {
	
	static int a = 10;
	int b = 30;
	
	 static void stu()
	{
		 System.out.println("Static methods are common");
	}
	 
	 void m1(int b)
	 {
		 this.b=b;
		 System.out.println(b);
	 }
	 
	 void display()
	 {
		 System.out.println(b);
	 }

	public static void main(String[] args) 
	{
		
		System.out.println(a);
		stu();
		StaticNthisKeywords th=new StaticNthisKeywords();
		th.m1(100);
		th.display();
	}

}
