
public class Area {
	static void Area(double r) {
		double area=3.14*r*r;
	System.out.println("Area of circle ="+area);
	}
	static void Area(int side)
	{
		int area=side*side;
		System.out.println("Area of Square ="+area);
	}
	static void Area(double l,double w )
	{
		double area=l*w;
		System.out.println("Area of Rectangle ="+area);
	}
	static void Area(int b,int h)
	{
		int area=(b*h)/2;
		System.out.println("Area of Triangle ="+area);
	}
	public static void main(String[] args)
	{
		Area(5);
		Area(6);
		Area(23,25);
		Area(6,7);
		
	}

}
