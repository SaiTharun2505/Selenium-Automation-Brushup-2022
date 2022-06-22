package j.Operators;

public class Test_Page_Operator {

	public static void main(String[] args) 
	{
		Base_Page_Operator OTest=new Base_Page_Operator();
		
		//Arthimetic test
		OTest.Arthimetic_operator(21, 22);
		
		//Relational test
		OTest.Relational_Operator(50, 30);
		
		//Logical test
		OTest.Logical_Operator(true, false);
		
		//incremental/Decremental test
		
		OTest.Increment_Decrement_Operator(15, 20);
		

	}

}
