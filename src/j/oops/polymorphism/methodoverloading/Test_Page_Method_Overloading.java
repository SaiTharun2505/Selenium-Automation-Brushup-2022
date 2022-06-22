package j.oops.polymorphism.methodoverloading;

public class Test_Page_Method_Overloading 
{

	public static void main(String[] args) 
	{
		Base_page_Method_Overloading Ptest=new Base_page_Method_Overloading();
		Ptest.method1();
		Ptest.method1(10, 20);
		Ptest.method1("Sai Tharun", 24);
		Ptest.method1("Sai Tharun",	" Sakkaram");
		Ptest.method1(10, 20, 30);
		Ptest.method1("Sai Tharun", " Sakkaram", "Manual test engineer");
	}

}
