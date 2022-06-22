package j.oops.polymorphism.methodoverloading;

public class Base_page_Method_Overloading 
{
	public void method1()
	{
		System.out.println("Method without Parameter  ");
	}
	
	public void method1(int a, int b)
	{
		System.out.println("Method with two parameters int and int : "+(a+b));
	}
	
	public void method1(String User_Name, String Surname)
	{
		System.out.println("MEthod with two parameters String and String : "+User_Name.concat(Surname));
	}
	
	public void method1(String Name, int age)
	{
		System.out.println(Name+" age is "+age);
	}
	
	public void method1(String Name, String Surname, String Profession)
	{
		System.out.println(Name+Surname+" is "+Profession);
	}
	
	public void method1(int a, int b, int c)
	{
		System.out.println("Addition of three numbers is : "+(a+b+c));
	}

}
