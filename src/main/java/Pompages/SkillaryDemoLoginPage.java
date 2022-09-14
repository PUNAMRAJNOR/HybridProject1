package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemoLoginPage 
{
	@FindBy(linkText="COURSE")
	private WebElement coursetab;
	
	@FindBy(linkText="Selenium Training")
	private WebElement seleniumtraning;
	
	@FindBy(name="addresstype")
	private WebElement coursedropdown;
	


	
	public WebElement getCoursedropdown() {
		return coursedropdown;
	}

	public SkillaryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() 
	{
		return coursetab;
	}
	
	
	public void seleniumTraningtab()
	{
		seleniumtraning.click();
	}
	
	

}
