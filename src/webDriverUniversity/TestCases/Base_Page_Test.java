package webDriverUniversity.TestCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Page_Test 
{
	static WebDriver driver;

	
	public void Browser_Launch(String Browser)
	{
	if(Browser=="Chrome")
	{
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	else if(Browser=="Firefox")
	{
		System.setProperty("webdriver.gecko.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	else if(Browser=="Edge")
	{
		System.setProperty("webdriver.edge.driver", "E:\\PROFESSIONAL\\selenium-jars&drivers\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	else
	{
		System.out.println("No Browser Initiated");
	}

	}
	
	public void Launch_URL()
	{
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
	}
	
	public String Current_Page_Title()
	{
		return driver.getTitle();
	}
	
	public void Browser_Close()
	{
		driver.quit();
	}

}


