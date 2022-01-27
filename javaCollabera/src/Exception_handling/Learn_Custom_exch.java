package Exception_handling;

import java.util.Scanner;

public class Learn_Custom_exch 
{
	public static void main(String [] args) throws UnderAgeException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age:");
		int age=sc.nextInt();
		try
		{
			if(age<=21)
			{
				throw new UnderAgeException(" 'under age Exception':age is under age");
			}
			else
			{
				System.out.println("show profile");
			}
		}
		catch(UnderAgeException u)
		{
			System.out.println("exception occured but it is handled:"+u.getMessage());
		}
	}

}

 class UnderAgeException extends Exception
{
	String ErrorMessage;
	UnderAgeException(String ErrorMessage)
	{
		this.ErrorMessage=ErrorMessage;
	}
	public String getMessage()
	{
		return ErrorMessage;
	}
	
}
