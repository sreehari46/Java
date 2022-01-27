package basic;

import java.util.Scanner;

public class Array_method {
	public static int add(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];
	}

	return sum;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
}
int res=add(a);
System.out.println("the sum is "+res);
}
}
