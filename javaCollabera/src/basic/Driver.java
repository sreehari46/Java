package basic;

 class Mc 
{
	int a;
	int b;
	int c;
	int sum;
	public void Add(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		sum=a+b+c;
		System.out.println(sum);
		
		}
}

 class Driver 
 
 {

	public static void main(String[] args) 
	{
	   Mc a1=new Mc();
	   
	   a1.a=10;
	   a1.b=30;
	   a1.c=20;
	   System.out.println(a1.a);
	   System.out.println(a1.b);
	   System.out.println(a1.c);
	   a1.Add(11,22, 33);
	}
 }
 

	   



