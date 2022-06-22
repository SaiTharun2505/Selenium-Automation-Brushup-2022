package j.oops.abstraction;

public class Abstraction_Childclass_Car extends Abstraction_Superclass_vehicle 
{
	public static void main(String[] args) 
	{
		Abstraction_Childclass_Car Atest=new Abstraction_Childclass_Car();
		System.out.println(Atest.a);
		System.out.println(Atest.b);
		Atest.b=100;
		System.out.println(Atest.b);
		
		Atest.Accelarator();
		Atest.cluth();
		Atest.Gear();
		Atest.Accelarator();
		Atest.Speed_Limit();
		System.out.println(Atest.Vehicle_company());
	}

	@Override
	public void Start() 
	{
		System.out.println("Car start functionality");
		
	}

	@Override
	public void Gear() {
		System.out.println("Car Gear functionality");		
	}

	@Override
	public void cluth() {
		System.out.println("Car clutch functionality");		
	}

	@Override
	public void Accelarator() {
		System.out.println("Car Accelarator functionality");		
	}

	@Override
	public String Vehicle_company() {
		return "S-Cross";
	}


}
