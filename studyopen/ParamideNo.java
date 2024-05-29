package studyopen;

public class ParamideNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int[] a = {1, 2, 3, 5, 7};
//		int[] b = {4, 5, 6, 7, 8};
//	
//		for(int i=0; i<a.length; i++)
//		{
//		for(int j=0;j<b.length;j++)
//		{
//		if(a[i] == b[j])
//		{
//		System.out.println(a[i]);
//		}
//		}
//		}
	int rows = 2;

	
	for (int i=1; i <= rows; i++)
	{
		for (int j=1; j <= rows-i; j++)
		{
			System.out.print(" ");	
		}
		
		int num = 1;
		for (int k=1; k <= i; k++)
		{
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
	}
	
	}

}
