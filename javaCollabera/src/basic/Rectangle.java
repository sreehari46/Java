package basic;

public class Rectangle {

	public static void main(String[] args) 
	{
		 Rect.rec();
		System.out.println(Rect.res);

	}

}
class Rect
{
	static double l=29;
	static double b=23.5;
	static double res=l*b;
public static void rec()
	{
	
		System.out.println(res);
	}
}
