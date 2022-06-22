package j.ControlStatements;

public class Base_Page_Iteration_Statements 
{
	
	
	//While loop 
	public void while_loop()
	{
		System.out.println("While loop output=====> ");
		int i=1;
		while(i<10)
		{
			System.out.println(i);
			i++;
			
		}
	}
	//Do while loop
	public void Do_while_loop()
	{
		int i=10;
		System.out.println("Do While loop output ==========> ");
		do
		{
			System.out.println(i);
			i--;
		}while(i>0);
	}
	
	//For loop
	public void For_loop()
	{
		System.out.println("for loop output ==========> ");
		for(int i=1; i<10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number : "+i);
			}
			else
			{
			System.out.println("Odd Number : "+i);
			}
		}
	}
	
	//nested for loop
	public void Nested_For_loop()
	{
	System.out.println("Nested for loop output ==========> ");
		for(int i=1; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.println(j);
			}
		}
	}
	
	//Enhanced for loop
	public void Enhanced_for_loop()
	{
		System.out.println("Enhanced for loop output ==========> ");
		int a[][]= {{1,2},{3,4},{5,6}};
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}
	}
	
}
