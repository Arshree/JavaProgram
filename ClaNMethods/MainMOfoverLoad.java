package ClaNMethods;

public class MainMOfoverLoad {

	public static void main(String[] args) {
		
		MethodOverloadingWithPolymorpism obj = new MethodOverloadingWithPolymorpism();
		obj.sum();
		obj.sum(1,2.2);
		obj.sum(2.3,4);
		obj.sum(1,2);
	}

}
