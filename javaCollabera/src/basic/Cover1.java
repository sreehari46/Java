package basic;

public class Cover1 {
	
	
	Cover1(int a)
	{
		System.out.println(a);
	}
	Cover1(int b,String c)
	{
		System.out.println(b+" "+c);
	}

	Cover1(String r,double p )
	{
		System.out.println(r+" "+p);
	}
	public static void main(String[] args) 
	{
	
		Cover1 a=new Cover1(10);
		Cover1 a1=new Cover1(10,"ranju");
		Cover1 a2=new Cover1("ranju",40.2);	
		
	}

}
