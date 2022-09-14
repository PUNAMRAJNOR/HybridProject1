package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage 
{
	@FindBy(xpath="//a[text()=' GEARS ']")// here we click on gears button
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")//here we click on skillary demo app
	private WebElement skillarydemoapp;
	
	
	@FindBy(xpath="//input[@name='q']")  
	private WebElement searchtextfield;// here we typing data for that no need to generate getter
	
	@FindBy(xpath="//input[@type='submit']")//here we simple click operation performing
	private WebElement searchbar;
	
	public SkillaryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void skillaryDemoApplication()
	{
		skillarydemoapp.click();
	}
	
	public void searchbaricon(String name)
	{
		searchtextfield.sendKeys(name);
	}
	
	public void searchbox()
	{
		searchbar.click();
	}
	
}
