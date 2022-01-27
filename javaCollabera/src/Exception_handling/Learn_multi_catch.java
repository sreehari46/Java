package Exception_handling;

public class Learn_multi_catch {

	public static void main(String[] args) 
	{
		int i=5,j=0,k;
		try
		{
			k=i/j;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception a)//this should be last block of the catch block and it handle automatically which exception this
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println(j);
		}
		

	}

}
