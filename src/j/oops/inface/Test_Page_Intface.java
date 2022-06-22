package j.oops.inface;

public class Test_Page_Intface implements Base_Page_Intface_one,Base_Page_Intface_two
{
	int a;
	int b;
	public static void main(String[] args) 
	{
		Test_Page_Intface Itest=new Test_Page_Intface();
		//System.out.println(Itest.a);
		Itest.a=Base_Page_Intface_one.a;
		Itest.b=Base_Page_Intface_one.b;
		
		System.out.println("Addition of a and b from base page intface one is : "+Itest.a+Itest.b);
		
		Itest.a=Base_Page_Intface_two.a;
		Itest.b=Base_Page_Intface_two.b;
		
		System.out.println("Addition of a and b from base page intface two is : "+Itest.a+Itest.b);
		
		Itest.One_M1();
		Itest.one_M2();
		Itest.one_M3();
		
		Itest.Two_M1();
		Itest.Two_M2();
		Itest.Two_M3();

		
		
		
		
	}

	@Override
	public void Two_M1() 
	{
		System.out.println("Base Page Interface two method1 execution ");
		
	}

	@Override
	public void Two_M2() {
		System.out.println("Base Page Interface two method2 execution ");		
	}

	@Override
	public void Two_M3() {
		System.out.println("Base Page Interface two method3 execution ");		
	}

	@Override
	public void One_M1() {
		System.out.println("Base Page Interface one method1 execution ");		
	}

	@Override
	public void one_M2() {
		System.out.println("Base Page Interface one method2 execution ");
	}

	@Override
	public void one_M3() {
		System.out.println("Base Page Interface one method3 execution ");		
	}
	

}
