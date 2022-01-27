package Exception_handling;

public class Learn_Exception 
{
	public static void main(String [] args)
	{
		int i,j,k;
		i=5;
		j=0;
		try
		{
			
			k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println(i);
		}
	}

}
