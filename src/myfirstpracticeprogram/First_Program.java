package myfirstpracticeprogram;

public class First_Program 
{
	String Name;
	String FName;
	String MName;  
	String Current_Job;
	String Current_Salary;
	String Expected_Job_Profile;
	String Expected_Salary;
	
	
	void Job_Profile(String Name, String FName, String MName, String Current_Job, String Current_Salary,
	String Expected_Job_Profile, String Expected_Salary) 
	{
		this.Name=Name;
		System.out.println("Eployee Name : "+this.Name);
		this.FName=FName;
		System.out.println("Employee Father Name : "+this.FName);
		this.MName=MName;
		System.out.println("Employee Father Name : "+this.MName);
		this.Current_Job=Current_Job;
		System.out.println("Current Job Designation : "+this.Current_Job);
		this.Current_Salary=Current_Salary;
		System.out.println("Current Salary : "+this.Current_Salary);
		this.Expected_Job_Profile=Expected_Job_Profile;
		System.out.println("Expected Job Designation : "+this.Expected_Job_Profile);
		this.Expected_Salary=Expected_Salary;
		System.out.println("Expected Salary : "+this.Expected_Salary);
		
		
		
	}
	

	public static void main(String[] args)
	{
		First_Program E_Details=new First_Program();
		E_Details.Job_Profile("Sai Tharun Sakkaram", "Narayana Sakkaram", "Sharadha Sakkaram", " Manual test engineer", 
				"16,600", " Automation test engineer", "4.5 LPA/ 33,000 PM");
		


	}

}
