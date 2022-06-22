package j.oops.encapsulation;

public class Test_Page_Encapsulation {

	public static void main(String[] args) 
	{
		Base_Page_Encapsulation Etest=new Base_Page_Encapsulation();
		Etest.setName("Sai Tharun");
		Etest.setAge(24);
		Etest.setProfession("Manual Test Engineer");
		
		System.out.println("Name :"+Etest.getName());
		System.out.println("Age :"+Etest.getAge());
		System.out.println("Profession :"+Etest.getProfession());
		

	}

}
