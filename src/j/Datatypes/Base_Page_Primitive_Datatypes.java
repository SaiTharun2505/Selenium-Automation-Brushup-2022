package j.Datatypes;

public class Base_Page_Primitive_Datatypes 
{
	/*
	 * DataTypes : A data type is an attribute of a variable which tells the compiler or interpreter 
	 * how the programmer intends to use the variable. Datatype allocates memory type and memory size to variable.
	 *
	 * => Datatypes classfied into two types :
	 * 		1. Primitive Data types : A primitive data type is pre-defined by the programming language. 
	 * 		The size and type of variable values are specified, and it has no additional methods.
	 * 
	 * 		2. Non - primitive Data types : These data types are not actually defined by the programming
	 * 		 language but are created by the programmer. They are also called “reference variables�? or “object
	 *   	references�? since they reference a memory location which stores the data.
	 */
	
	/*
	 * => 1. Primitive Data Types : 
	 */
	
	 /* 	a. byte :  byte stores numbers that lie between -128 to 127. A byte data type is helpful for 
	 * 		 saving memory in large amounts. Default size of this data type : 1 byte
	 */
			byte b = 127; //byte data type declaration
			byte b1 = -128;
			byte b5;
			/*byte b2 = 128;
			byte b3 = -129; We cannot define byte values below -128 or above 127, if we define it show syntax error
			cannot convert from int to byte */
	/*
	 * 		b. short : A short data type is greater than byte in terms of size and less than a integer.
	 * 		 short stores the value that ranges from -32,768 to 32,767. The default size of this data type: 2 bytes.
	 */
			short s = 32767; //short data type declaration
			short s1 = -32768;
			short s4;
			/*short s2 = 32768;
			short s3 = -32769; we cannot define short values below -32768 and above 32767 if we define it show syntax error
			cannot convert from int to short */
	/*
	 * 		c. int : This data type can store whole numbers from -2147483648 to 2147483647. Generally,
	 * 		 int is the preferred data type when you create variables with a numeric value.	
	 * 		 The default size of this data type: 4 bytes.	
	 */
			int i = 2147483647; //short data type declaration
			int i1= -2147483648;
			int i4;
			/*int i2 = 2147483648; 
			int i3= -2147483649; we cannot define int values below -2147483648 and above 2147483647
			
	/*
	 * 		d. long : This data type is a 64-bit two’s complement integer. By default,
	 * 		 the size of a long data type is 8 bytes and its value ranges from -263 to 263-1.for long we
	 * 		 have to define "L" after number. 
	 */
			long l=1500000000000L;
			long l1=-150000000000000L;
			long l2;
			/*long l3=15000000000000; we cannot define long number without ending with "L" if number is greater than "2147483647"'
			
			
	/*
	 * 		e. float : This data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should
	 * 		 end the value with an “f�?.	The default size of this data type: 4 bytes.	
	 */
			float f=5.00000000000000000000000000000000013343553f;
			float f1=-5.05060324045034036060f;
			float f2;
			//float f3=5.34634647; We cannot define float number without ending wih "f"
			
	/*
	 * 		f. double : The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
	 * 		 Note that you should end the value with a “d�?. The default size of this data type: 8 bytes.		
	 */
			double d=5.25040454954454509395320d;
			double d1=-5.320932545435345453443d;
			double d2;
			//double d3=5.34634647; We cannot define double number without ending wih "d"
			
	/*
	 * 		g. Char : This data type is used to store a single character. The character must be enclosed within single quotes,
	 * 		 like ‘E’ or ‘e’. Alternatively, you can also use ASCII values to display certain characters.
	 * 		 The default size of this data type: 8 bytes.		
	 */
			char c='S';
			char c1=65;
			char c4;
			/*char c2="s";
			char c3='Sai'; We cannot store char in double qotes  and we cannot store word in char*/
			
	/*
	 * 		h. boolean : A boolean data type comprises of a bit of information and can store only true or false values.
	 * 		 This data type is used to track true/false conditions.		
	 */
	
			boolean bo= s>s1;
			boolean bo1= s<s1;
			boolean bo2;
			/*boolean bo2="Sai"; We cannot store characters, words, numbers in boolean */ 
			

}
