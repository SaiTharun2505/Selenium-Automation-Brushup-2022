package j.oops.inheritance;

public class Inheritance_Childclass_Bike extends Inheritance_Superclass_vehicle{

	public static void main(String[] args) 
	{
		Inheritance_Childclass_Bike Atest=new Inheritance_Childclass_Bike();
		System.out.println(Atest.a);
		System.out.println(Atest.b);
		Atest.b=50;
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
		System.out.println("Bike start functionality");
		
	}

	@Override
	public void Gear() {
		System.out.println("Bike Gear functionality");		
	}

	@Override
	public void cluth() {
		System.out.println("Bike clutch functionality");		
	}

	@Override
	public void Accelarator() {
		System.out.println("Bike Accelarator functionality");		
	}

	@Override
	public String Vehicle_company() {
		return "Bajaj";
	}

}
