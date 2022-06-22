package j.oops.basics;

public class Modifiers_Example 
{
	void M1()
	{
		System.out.println("Default methods will access within the package! ");
	}
	
	public void M2()
	{
		System.out.println("Public methods will access every where in the project! ");
	}
	
	protected void M3()
	{
		System.out.println("Protected methods will access within the package and out of"
				+ " the package with inheritance only! ");
	}
	
	private void M4()
	{
		System.out.println("private methods will access every where in the project! ");
	}
	
	public static void main(String[] args) 
	{
		Modifiers_Example Mtest=new Modifiers_Example();
		Mtest.M1();
		Mtest.M2();
		Mtest.M3();
		Mtest.M4();
	}
	
	

}
