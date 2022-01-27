package Exception_handling;

public class Lean_Stack_unwind 
{
	static void a()
	{
		int k=4/0;
		System.out.println(k);
	}
	static void b()
	{
		a();
	}

	static void c()
	{
		b();
	}
	public static void main(String[] args) throws ArithmeticException
	{
		c();
	}

}
