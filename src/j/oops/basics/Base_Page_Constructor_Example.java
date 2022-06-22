package j.oops.basics;

public class Base_Page_Constructor_Example 
{
	int a;
	int b;
	
	//Constuctor without parameters
	Base_Page_Constructor_Example()
	{
		a=10;
		b=20;
		System.out.println("Constructor without parameters : "+(a+b));
	}
	
	//Constructor with parameter
	Base_Page_Constructor_Example(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor with parameters : "+(a-b));
	}

}
