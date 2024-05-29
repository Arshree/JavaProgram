package studyopen;

public class Fibonanci {

	public static void main(String[] args) {
		int a=0, b=1, c=0;
		
		System.out.print(a+" "+b);
		
		for(int i=2;i<10;i++){
			
		c=a+b;//i=1,c=2, i=3, c= 5
		
		System.out.print(" "+c);//2
		
		a=b;//a=2
		b=c;//b=2
		
		}

	}

}
