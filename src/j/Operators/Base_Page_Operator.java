package j.Operators;

public class Base_Page_Operator 
{
	int a;
	int b;
	boolean a1;
	boolean b1;
	
	public void Arthimetic_operator(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	//Addition (+)
		System.out.println("Addition of two numbers : "+(this.a+this.b));
		
	//Sunbtraction (-)
		System.out.println("Substraction of two numbers : "+(this.a-this.b));
		
	//Multiplication (*)
		System.out.println("Multiplication of two numbers : "+(this.a*this.b));
		
	//Division (/)
		System.out.println("Division of two numbers : "+(this.a/this.b));
		
	//Modulus (%)
		System.out.println("Modulus of two numbers : "+(this.a%this.b));
	}
	
	public void Relational_Operator(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	// == operator
		System.out.println("Equals operator a is equals to b : "+(a==b));
		
	// > operator
		System.out.println("a greater than b : "+(a>b));
		
	// < operator
		System.out.println("a is less than b :"+(a<b));
		
	// >= operator
		System.out.println("a greater than or equals to b : "+(a>=b));
				
	// <= operator
		System.out.println("a is less than or equals to b :"+(a<=b));	
		
	// != operator
		System.out.println("a is not equals to b :"+(a!=b));
	}
	
	public void Logical_Operator(boolean a1, boolean b1)
	{
		this.a1=a1;
		this.b1=b1;
		
	// && operator
		System.out.println("AND Operator : "+(a1&&b1));
		
	// || operator
		System.out.println("OR Operator : "+(a1||b1));	
		
	// ! operator
		System.out.println("NOT Operator : "+(!a1));
		System.out.println("NOT Operator : "+(!b1));
		
	}
	
	public void Increment_Decrement_Operator(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		this.a++; 
		this.b--;
		
	// Increment operator 
		System.out.println("Increment of a : "+(this.a));
		
	// Decrement operator
		System.out.println("Decrement of b : "+(this.b));
		
	}
	 

}
