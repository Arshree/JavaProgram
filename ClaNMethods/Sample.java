package ClaNMethods;

	class Sample{

		void m1()
		{
		System.out.println("Overloading");
		}

		void m1(int a, int b)
		{
			System.out.println(a+b);
		}

		public static void main(String[] args){

		Sample s = new Sample();
		s.m1();
		s.m1(10,20);
}
	}
