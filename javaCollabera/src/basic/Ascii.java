package basic;

public class Ascii {

	public static void main(String[] args) 
	{
		int k=65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)k);//converting from integer to character using cast operator
				k++;			
			}
			System.out.println();
		}

	}

}
