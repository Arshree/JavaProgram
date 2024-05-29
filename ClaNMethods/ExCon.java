package ClaNMethods;

public class ExCon {
	
	double width, height, depth;
	
	ExCon()
	{
		/*width=0;
		height=0;
		depth=0;
		*/
		
		width=height=depth=0;
	}
	
	ExCon(double w, double h, double d){
		width =w;
		height = h;
		depth = d;
	}
	
	ExCon(double len)
	{
		width=height=depth=len;
	}
	
	double volume() {
		return(width*height*depth);
	}
}
