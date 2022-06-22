package j.Datatypes;

public class Base_Page_Derived_Datatypes_Array 
{
	//Single Dimentional array
	public void Single_dimensional_array()
	{
		System.out.println("Single Dimensional array Value ======> ");
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	//Single dimensional array without creating boundary
	public void Single_dimensional_array1()
	{
		System.out.println("Single Dimensional array1 Values ======> ");
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	//Multi Dimensional array
	public void Multi_dimensional_array()
	{
		System.out.println("Multi Dimensional array Values ======> ");
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
			System.out.println(a[i][j]);
			}
		}
		
		
	}
	
	//Multi dimensional array without creating boundary
	public void Multi_dimensional_array1()
	{
		System.out.println("Multi Dimensional array1 Values ======> ");
		int a[][]= {{10,20}, {30,40}, {50,60}, {70,80}, {90,100}};
		
		for(int i[]:a)
		{
			for(int j:i)
			{
			System.out.println(j);
			}
		}
	}
	
	
	
	

}
