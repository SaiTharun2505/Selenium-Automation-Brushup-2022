package j.oops.abstraction;

public abstract class Abstraction_Superclass_vehicle 
{
	public int a=10;
	public int b=30;
	
	public abstract void Start();
	public abstract void Gear();
	public abstract void cluth();
	public abstract void  Accelarator();
	public abstract String Vehicle_company();
	
	public void Speed_Limit()
	{
		System.out.println("Speed limit for this vehicle is 100 KMPH! ");
	}
	
	

}
