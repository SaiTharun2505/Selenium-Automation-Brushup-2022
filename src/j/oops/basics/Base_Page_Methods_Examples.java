package j.oops.basics;

public class Base_Page_Methods_Examples
{
	//Methods without parameters and without return type
	public void method_nop_nor()
	{
		int a=10;
		int b=20;
		
		System.out.println("Method without return type and without parameters  : "+(a+b));
	}
	
	//Method with pameters and without return type
	
	public void method_wp_nor(String Name, String Profession, String Expected_Salary)
	{
		System.out.println("MEthod with Paramters and without return type");
		System.out.println(Name);
		System.out.println(Profession);
		System.out.println(Expected_Salary);
	}
	
	//Method with return type and without paramters
	
	public String Name()
	{
		String Name="Sai Tharun";
		return Name;
	}
	
	//Method with parameters and without parameters
	
	public String Name1(String Name)
	{
		return Name;
	}

}
