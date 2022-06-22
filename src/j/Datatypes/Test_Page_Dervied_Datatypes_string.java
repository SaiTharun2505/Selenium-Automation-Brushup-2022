package j.Datatypes;

public class Test_Page_Dervied_Datatypes_string {

	public static void main(String[] args) {
		Base_Page_Derived_Datatypes_string Stest=new Base_Page_Derived_Datatypes_string();
		
		//Length of string
		int ls=Stest.Surname.length();
		System.out.println("Length of string : "+ls);
		
		//Concat method in string
		String cs=Stest.Surname.concat(Stest.Name);
		System.out.println("Concatination of two strings : "+cs);
		
		//Contains method in string
		boolean cos=Stest.Surname.contains("akka");
		System.out.println("Contains method in string : "+cos);
		
		//charAt method in string
		char chs=Stest.Surname.charAt(5);
		System.out.println("charAt method in string : "+chs);
		
		//equals method in string
		boolean es=Stest.Surname.equals("sakkaram");
		System.out.println("Equal method in string : "+es);
		
		//equalsignore case in string
		boolean es1=Stest.Surname.equalsIgnoreCase("SAKKARAM");
		System.out.println("Equals ignorecase in string : "+es1);
		
		//Endswith method in string
		boolean es2=Stest.Surname.endsWith("am");
		System.out.println("End with method in string : "+es2);
		
		//Is empty method in string
		boolean ies=Stest.Surname.isEmpty();
		System.out.println("Isempty method in string "+ies);
		
		//replace method in string
		String rs=Stest.Surname.replace('a', 'e');
		System.out.println("Replace method in string"+rs);
		
		//trim method inm string 
		String ts=Stest.Profession.trim();
		System.out.println("Troim method in String : "+ts);		
		
		//substing method in string
		String ss=Stest.Name.substring(3, 6);
		System.out.println("Substring method in string : "+ss);
		
		//LowerCase Method in string 
		String tls=Stest.Surname.toLowerCase();
		System.out.println("Lower case method in string : "+tls);
		
		//UpperCase method in string
		String tus=Stest.Name.toUpperCase();
		System.out.println("Upper case method in string : "+tus);
	
		}
	}
