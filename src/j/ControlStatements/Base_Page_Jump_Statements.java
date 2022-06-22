package j.ControlStatements;

public class Base_Page_Jump_Statements 
{
	//Breka Statement
	public void Break_Statement()
	{
		System.out.println("Break Statement output ==========> ");
		for(int i=1; i<10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
				if(i==6)
				{
					break;
				}
			}
			else
			{
				System.out.println("Odd Number : "+i);
			}
		}
	}
	
	//Continue Statement
	public void Continue_Statement()
	{
		System.out.println("Continue Statement output ==========> ");
		for(int i=1; i<10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
			else
			{
				if(i==7)
				{
					continue;
				}
				System.out.println("Odd Number : "+i);
			}
		}
	}

}
