package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pompages.AddToCart;
import Pompages.SkillaryDemoLoginPage;
import Pompages.SkillaryLoginPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{
   @Test
   public void tc1()
   {
	   SkillaryLoginPage s=new SkillaryLoginPage(driver);
	   s.gearsbutton();
	   s.skillaryDemoApplication();
	   
	   utilies.switchingTab(driver);	//here we switch the control to new tab
		
		
	    SkillaryDemoLoginPage s1=new SkillaryDemoLoginPage(driver);
		utilies.mouseHover(driver,s1.getCoursetab());
	    s1.seleniumTraningtab();
	    
	    AddToCart a=new AddToCart(driver);
	    utilies.doubleClick(driver,a.getPlusbtn());
	     a.addToCartButton();
	     
	     utilies.alertPopups(driver);
	    
		
		
		   
			  
   }
}

