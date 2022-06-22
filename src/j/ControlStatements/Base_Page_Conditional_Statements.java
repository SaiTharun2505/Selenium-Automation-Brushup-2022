package j.ControlStatements;

public class Base_Page_Conditional_Statements 
{
	
	int age;
	int day;
	
	//if else method
	public void if_else(String Name, int age)
	{
		this.age=age;
		if(this.age>18) 
		{
			System.out.println(Name+" is Eligible to vote");
		}
		else
		{
			System.out.println(Name+" is not eligible to vote");
		}
	}
	
	//nested if else method
	public void Nested_If(int age)
	{
		this.age=age;
		if(this.age<18)
		{
			System.out.println("Teen Age");
		}
		else if(this.age>18&&this.age<35)
		{
			System.out.println("Young Age");
		}
		else if(this.age>35&&this.age<50)
		{
			System.out.println("Middle Age");
		}
		else
		{
			System.out.println("Old Age");
		}
	}
	
	//Switch Case Method
	
	public void switch_Case(int day)
	{
		this.day=day;
		switch(day)
		{
		case 1 : System.out.println("Monday"); break;
		case 2 : System.out.println("Tuesday"); break;
		case 3 : System.out.println("Wednesday"); break;
		case 4 : System.out.println("Thursday"); break;
		case 5 : System.out.println("Friday"); break;
		case 6 : System.out.println("Satueday"); break;
		case 7 : System.out.println("Sunday"); break;
		default : System.out.println("Selected wrong Day");
		}
	}
}
