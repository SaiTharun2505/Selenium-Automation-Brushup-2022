package j.Datatypes;

public class Test_Page_Primitive_Datatypes {

	public static void main(String[] args) 
	{
		Base_Page_Primitive_Datatypes Dtest=new Base_Page_Primitive_Datatypes();
		
		//tyte values
		System.out.println(" byte values ========== ");
		System.out.println(" Positive Byte border Value : "+Dtest.b);
		System.out.println(" Negative Byte border Value : "+Dtest.b1);
		Dtest.b5=125;
		System.out.println(" Initializing byte value in test Page : "+Dtest.b5);
		
		//short values
		System.out.println(" short values ========== ");
		System.out.println(" Positive short border Value : "+Dtest.s);
		System.out.println(" Negative short border Value : "+Dtest.s1);
		Dtest.s4=30000;
		System.out.println(" Initializing short value in test Page : "+Dtest.s4);
		
		//int values
		System.out.println(" int values ========== ");
		System.out.println(" Positive int border Value : "+Dtest.i);
		System.out.println(" Negative int border Value : "+Dtest.i1);
		Dtest.i4=30000000;
		System.out.println(" Initializing int value in test Page : "+Dtest.i4);
		
		//long values
		System.out.println(" long values ========== ");
		System.out.println(" Positive long border Value : "+Dtest.l);
		System.out.println(" Negative long border Value : "+Dtest.l1);
		Dtest.l2=30000000436774457L;
		System.out.println(" Initializing long value in test Page : "+Dtest.l2);
						
		//float values
		System.out.println(" flaot values ========== ");
		System.out.println(" Positive float border Value : "+Dtest.f);
		System.out.println(" Negative float border Value : "+Dtest.f1);
		Dtest.f2=30000000.0000f;
		System.out.println(" Initializing float value in test Page : "+Dtest.f2);
		
		//double values
		System.out.println(" double values ========== ");
		System.out.println(" Positive double border Value : "+Dtest.d);
		System.out.println(" Negative double border Value : "+Dtest.d1);
		Dtest.d2=30000000.000768585656570d;
		System.out.println(" Initializing double value in test Page : "+Dtest.d2);
		
		//char values
		System.out.println(" char values ========== ");
		System.out.println(" char Value : "+Dtest.c);
		System.out.println(" char Value : "+Dtest.c1);
		Dtest.c4='F';
		System.out.println(" Initializing char value in test Page : "+Dtest.c4);
				
		//boolean values
		System.out.println(" boolean values ========== ");
		System.out.println(" boolean border Value : "+Dtest.bo);
		System.out.println(" boolean border Value : "+Dtest.bo1);
		Dtest.bo2= Dtest.s==Dtest.s1;
		System.out.println(" Initializing boolean value in test Page : "+Dtest.bo2);		
		
								
		
	}

}
