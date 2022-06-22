package j.oops.basics;

public class Example_obj 
{
	String Name;
	String Family_Name;
	String Father_Name;
	String Mother_Name;
	int Family_Members;
	
	public void family_details(String Name, String Family_Name, String Father_Name, String Mother_Name, 
			int Family_Members) 
	{
		this.Name=Name;
		this.Family_Name=Family_Name;
		this.Father_Name=Father_Name;
		this.Mother_Name=Mother_Name;
		this.Family_Members=Family_Members;
		
		System.out.println("User Name : "+this.Name);
		System.out.println("User Family Name : "+this.Family_Name);
		System.out.println("User Father Name : "+this.Father_Name);
		System.out.println("User Mother Name : "+this.Mother_Name);
		System.out.println("User Family Members count : "+this.Family_Members);
	}
	

	public static void main(String[] args) 
	{
		Example_obj Otest=new Example_obj();
		Otest.family_details("Sai Tharun", "Sakkaram", "Narayana", "Sharadha", 5);

	}

}
