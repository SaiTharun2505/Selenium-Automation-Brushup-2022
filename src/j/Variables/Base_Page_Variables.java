package j.Variables;

public class Base_Page_Variables
{
	/*
	 * Varaible = Varaible is a container which holds a Value.In Java programming values can be stored into variables
	 * according to data type given.
	 * => Variable declaration to follow :
	 * 		1. Characters [ int number; string Name, String email ]
	 * 		2. Characters + Numbers [ int number1, String sai123 ]
	 * 		3. Characters with under score [ int greater_number, string User_Name ]
	 * => Variable declaration not to follow :
	 * 		1. Numbers + Characters
	 * 		2. Don't include space
	 * 		3. Don't include special characters
	 * 
	 * 	Types of Variables available in java :
	 * 		1. Local Variable : This variables define inside method it can't share information to other 
	 * 			methods and also for other class.
	 * 		2. instant / Global Variable : This variables define inside the class but outside the method, these variables
	 * 			can access across method and classes.
	 *		3. Class Variable : This variables are similar to instant variables, only difference we declare class variables
	 *			with static keyword
	 *
	 * 	Variable initiation can be done in 4 Ways :
	 * 		1. Declaration time
	 * 	 	2. By using reference variable
	 * 		3. By using method
	 * 		4. By using constructor
	 */
	
	//Initializing values at Declaration time
	//Instant/Global Variables
	
	int Lucky_Number=9;
	static String Favourite_Actor="Pavan Kalyan & NTR";
	
	
	
	//Variable Declaration :
	
	String SurName;
	String User_Name;
	String User_Pwd;
	String User_Mobile_No;
	String Purchase_Item;
	String Item_Price;
	String Payment_Method;
	//String My_Profession;
	
	
	//variable initialization using constructor :
	
	public Base_Page_Variables(String SurName,String User_Name, String User_Pwd, String User_Mobile_No, String Purchase_Item, 
			String Item_Price, String Payment_Method) 
	{
		this.SurName=SurName;
		this.User_Name=User_Name;
		this.User_Pwd=User_Pwd;
		this.User_Mobile_No=User_Mobile_No;
		this.Purchase_Item=Purchase_Item;
		this.Item_Price=Item_Price;
		this.Payment_Method=Payment_Method;
		
		System.out.println(" SurName of the User : " + this.SurName);
		System.out.println(" Name of the User : " + this.User_Name);
		System.out.println(" Password of the User : " + this.User_Pwd);
		System.out.println(" Mobile Number of the User : " + this.User_Mobile_No);
		System.out.println(" Item Purchase by user : " + this.Purchase_Item);
		System.out.println(" Price of the Item : " + this.Item_Price);
		System.out.println(" Payment Mode : " + this.Payment_Method);
		System.out.println(" Thanks for using Flipkart for Purchase, Your order placed successfully!");
		System.out.println("                                                    ");
	}


	
	//Variable initialization using method
	
	public void variable_Initiation_by_Method(String SurName,String User_Name, String User_Pwd, String User_Mobile_No, String Purchase_Item, 
			String Item_Price, String Payment_Method, String My_Profession) 
	{
		// Local Variable :
		// My_Porfession declared in method paramter it is local variable
		
		
		
		//Global Variables :
		this.SurName=SurName;
		this.User_Name=User_Name;
		this.User_Pwd=User_Pwd;
		this.User_Mobile_No=User_Mobile_No;
		this.Purchase_Item=Purchase_Item;
		this.Item_Price=Item_Price;
		this.Payment_Method=Payment_Method;
		
		System.out.println(" SurName of the User : " + this.SurName);
		System.out.println(" Name of the User : " + this.User_Name);
		System.out.println(" Password of the User : " + this.User_Pwd);
		System.out.println(" Mobile Number of the User : " + this.User_Mobile_No);
		System.out.println(" Item Purchase by user : " + this.Purchase_Item);
		System.out.println(" Price of the Item : " + this.Item_Price);
		System.out.println(" Payment Mode : " + this.Payment_Method);
		System.out.println(" Thanks for using meesho for Purchase, Your order placed successfully!");
		System.out.println(" My Profession "+My_Profession);
		
	}
	
	
	

}
