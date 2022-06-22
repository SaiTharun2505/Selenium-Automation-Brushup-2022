package webDriverUniversity.Page0bjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{
	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="text") public WebElement Login_Portal;
	@FindBy(id="text") public WebElement Login_User;
	@FindBy(id="password") public WebElement Login_Password;
	@FindBy(id="login-button") public WebElement Login_Button;
	
	public void setLoginUser(String User_Name)
	{
		Login_User.clear();
		Login_User.sendKeys(User_Name);
	}
	
	public void setLoginPassword(String Password)
	{
		Login_Password.clear();
		Login_Password.sendKeys(Password);
	}
	
	public void click_Login()
	{
		Login_Button.click();
	}
	
	
}

