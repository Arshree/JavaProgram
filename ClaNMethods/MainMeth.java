package ClaNMethods;

public class MainMeth {

		// We can Overloaded main method also
		// main methos is similar like methods but jvm execution stating from main method only and String[] - string array
		
		void main(String s)
		{
			System.out.println(s);
			
		}
		
		void main (int x)
		{
			System.out.println(x);
		}
		
		void main (int x, int y ) {
			System.out.println(x+y);
		}
		
		public static void main(String[] args) 
		{
			MainMeth m = new MainMeth();
			
			m.main("Main method can overload");
			m.main(10);
			m.main(20,30);
			
		
		}

}
