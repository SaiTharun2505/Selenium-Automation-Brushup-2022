package j.oops.polymorphism.Methodoveriding;

public class Override_Childclass_Bike extends Override_Superclass_vehicle
	{

	public static void main(String[] args) 
	{
		
		Override_Childclass_Bike Atest=new Override_Childclass_Bike();
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
