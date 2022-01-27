package basic;

public class Circle {

	public static void main(String[] args) {
		new Cir().area();
		//System.out.println(new Cir().res);

	}

}
class Cir
{
	//double r=34.8;
	//double pi=3.14;
     //double res=pi*r*r;
	void area()
	{
		double r=34.8;
		double pi=3.14;
		double res=pi*r*r;	
		System.out.println(res);
		
	}
}
