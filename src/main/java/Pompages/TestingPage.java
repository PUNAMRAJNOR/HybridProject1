package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	

	public void facebookicon() {
		facebookicon.click();
	}


	public WebElement getFacebookicon() {
		return facebookicon;
	}


	public WebElement getSeleniumTraning()
	{
		return seleniumtraining;
	}
	
	
  public WebElement getCarttab() 
  {
		return carttab;
	}


public TestingPage(WebDriver driver)
  {
	 
	PageFactory.initElements(driver, this);
  }
  
 
  
}
