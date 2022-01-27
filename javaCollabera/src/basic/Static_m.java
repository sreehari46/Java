package basic;

class Static_m1 {
	static int a;
	static int b;
	static int c;
	
	public static void Add(int a,int b,int c)
	{
		 int sum=a+b+c;
		System.out.println(sum);
	}

}
class Static_m
{
	public static void main(String [] args)
	{
		Static_m1.a=10;
		Static_m1.b=40;
		Static_m1.c=50;
		System.out.println(Static_m1.b);
		Static_m1 a1=new Static_m1();
		System.out.println(a1.b);
		Static_m1 a2=new Static_m1();
		System.out.println(a2.b);

	}
}
