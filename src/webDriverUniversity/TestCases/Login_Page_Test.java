package webDriverUniversity.TestCases;

import java.util.concurrent.TimeUnit;

import webDriverUniversity.Page0bjects.Login_Page;

public class Login_Page_Test extends Base_Page_Test
{
	public static void main(String[] args) throws Exception 
	{
		Login_Page_Test Test=new Login_Page_Test();
		Test.Browser_Launch("Chrome");
		Test.Launch_URL();
		
		if(Test.Current_Page_Title().trim().contains("WebDriver | Login Portal"))
		{
			System.out.println(" Launched URL was : "+Test.Current_Page_Title().trim());
		}
		else
		{
			System.out.println("Launched URL was wrong you cannot test further : "+Test.Current_Page_Title());
		}
		
		//Test1
		Login_Page page_object=new Login_Page(driver);
		page_object.setLoginUser("Sai Tharun");
		page_object.setLoginPassword("sdgffsdgh");
		page_object.click_Login();
		
		
		
		if(driver.switchTo().alert().getText()=="validation failed")
		{
			System.out.println("Test1 Pass");
			System.out.println("Test 1 Login Status : "+driver.switchTo().alert().getText());
		}
		else
		{
			System.out.println("Test1 Fail");
			System.out.println("Test 1 Login Status : "+driver.switchTo().alert().getText());
		}
		
		driver.switchTo().alert().accept();
		//Test2
		page_object.setLoginUser("");
		page_object.setLoginPassword("sdgffsdgh");
		page_object.click_Login();
		
		if(driver.switchTo().alert().getText()=="validation failed")
		{
			System.out.println("Test2 Pass");
			System.out.println("Test 2 Login Status : "+driver.switchTo().alert().getText());
		}
		else
		{
			System.out.println("Test2 Fail");
			System.out.println("Test 2 Login Status : "+driver.switchTo().alert().getText());
			
		}
		
		driver.switchTo().alert().accept();
		
		//Test3
		page_object.setLoginUser("");
		page_object.setLoginPassword("");
		page_object.click_Login();
		
		
		if(driver.switchTo().alert().getText()=="validation failed")
		{
			System.out.println("Test3 Pass");
			System.out.println("Test 3 Login Status : "+driver.switchTo().alert().getText());
		}
		else
		{
			System.out.println("Test3 Fail");
			System.out.println("Test 3 Login Status : "+driver.switchTo().alert().getText());
		}
		
		driver.switchTo().alert().accept();
		
		
		Test.Browser_Close();
		
		
	}

}
