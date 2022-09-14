package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public WebDriverUtilies utilies=new WebDriverUtilies();//every time create karnya peksha ekdach create karaycha object
	
	
	
	@BeforeMethod
	public void openApp() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(pdata.getPropertyData("url"));
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	
	public void closeApp(ITestResult res) throws IOException
	{
		int status=res.getStatus();
		String name = res.getName();
		
		if(status==2)
		{
			Photo p=new Photo();
			p.getPhoto(driver,name);
		}
		
		driver.quit();
	}
}
