package Day3;

public class LeafYear {

	public static void main(String[] args) {
		double year=2022;
		boolean res = year % 4 == 0;
		boolean res1 = year %100 != 0;
		boolean res2 = year%400 == 0;
		boolean res3 = (res && res1) || res2;
		System.out.println(res3);

	}

}
