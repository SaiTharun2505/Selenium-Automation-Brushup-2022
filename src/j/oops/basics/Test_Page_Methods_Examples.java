package j.oops.basics;

public class Test_Page_Methods_Examples {

	public static void main(String[] args)
	{
		Base_Page_Methods_Examples Mtest=new Base_Page_Methods_Examples();
		Mtest.method_nop_nor();
		Mtest.method_wp_nor("Sai Thaurn", "Manual test Engineer", "450000");
		System.out.println("Method with return type and without parameters : "+Mtest.Name());
		System.out.println("Method with return type and with parameter :"+Mtest.Name1("Sai Tharun"));
		

	}

}
