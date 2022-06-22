package s.BrowserLaunch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome_Launch 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver = null;
		
		
		String Browser="Chrome";
		if(Browser=="Chrome")
		{
			Map<String, Object> prefs=new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications",2);
			ChromeOptions options= new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}
		
		else if(Browser=="Firefox")
		{
			System.setProperty("webdriver.gecko.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(Browser=="Edge")
		{
			System.setProperty("webdriver.edge.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("No Browser Initiated");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Email_Adress=driver.findElement(By.name("email"));
		Email_Adress.clear();
		Email_Adress.sendKeys("9542950884");
		System.out.println(Email_Adress.getAttribute("value"));
		
		WebElement Password=driver.findElement(By.name("pass"));
		Password.clear();
		Password.sendKeys("Chinnu@143");
		System.out.println(Password.getAttribute("Value"));
		WebElement Login_Button=driver.findElement(By.name("login"));
		Login_Button.click();
		
		//Thread.sleep(10000);
		/*Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();*/
		
		//Thread.sleep(5000);
		
		WebElement Profile_Button=driver.findElement(By.xpath("(//div[@aria-label='Your profile'])[1]"));
		
		Profile_Button.click();
		
		WebElement Logout_button=driver.findElement(By.xpath("//span[contains(.,'Log Out')]"));
		Logout_button.click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
