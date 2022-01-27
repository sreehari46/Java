package basic;

public class Static_ns 
{
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		Static_ns a=new Static_ns();

	} 

}
