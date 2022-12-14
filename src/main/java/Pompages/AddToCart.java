package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart
{
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusbtn() 
	{
		return plusbtn;
	}
	public void addToCartButton()
	{
		addtocartbtn.click();
	}
	
	

}
