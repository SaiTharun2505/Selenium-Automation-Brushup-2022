package j.Variables;

public class Test_page {

	public static void main(String[] args) 
	{
		//Variable initiation through constructor
		Base_Page_Variables Vtest=new Base_Page_Variables("Thota", "Bhargav", "Bar@123", "8179360420", "Mobile", "25,000", "Google_Pay");	
		//Calling Variable from other class
		int L=Vtest.Lucky_Number;
		System.out.println(" My Lucky Number is : "+L);
		
		//static method
		String F=Base_Page_Variables.Favourite_Actor;
		System.out.println(" My Favourite Actors are : "+F);
		
		//Calling variable from other class and initiating the value
		
		Vtest.SurName="Sakkaram";
		Vtest.User_Name="Sai Tharun";
		Vtest.User_Pwd="Sai@143";
		Vtest.User_Mobile_No="9542950884";
		Vtest.Purchase_Item="HP_Pavilion";
		Vtest.Item_Price="58,000";
		Vtest.Payment_Method="Phonepay";
		
		System.out.println(" User Name : "+Vtest.SurName+Vtest.User_Name);
		System.out.println(" User Password : "+Vtest.User_Pwd);
		System.out.println(" USer Mobile Number : "+Vtest.User_Mobile_No);
		System.out.println(" Purchased Item : "+Vtest.Purchase_Item);
		System.out.println(" Item Price : "+Vtest.Item_Price);
		System.out.println(" Mode of Paymnet : "+Vtest.Payment_Method);
		System.out.println(" Thanks for Using Amazon for purchase, You order was placed successfully");
		System.out.println("                                                    ");
		
		//Variable inititiation through method
		Vtest.variable_Initiation_by_Method("Ennela", "Pavan", "pav@123", "8185055806", "Laptop", "80,000", "Credit_Card", "MCA Final Year Student");
		
	}

}
