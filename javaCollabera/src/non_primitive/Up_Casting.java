package non_primitive;

public class Up_Casting 
{

	public static void main(String[] args) 
	{
		Up2 b1=new Up2();
		System.out.println(b1.i);
		System.out.println(b1.j);
		Up1 a1=new Up1();
		System.out.println(a1.i);
		//System.out.println(a1.j);we cannot access sub class property to super class property
		Up1 a2=b1;
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(a2.i);
		//System.out.println(a2.j);we cannot access subclass to super class
		
		

	}

}
