package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pompages.CoreJavaPage;
import Pompages.SkillaryLoginPage;
import Pompages.WishListPage;
import genericLibrary.BaseClass;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws Throwable 
	{
		
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.searchbaricon(pdata.getPropertyData("searchtextfielddata"));
		s.searchbox();
		
		CoreJavaPage c=new 	CoreJavaPage(driver);
		c.seleniumTraning();
		utilies.switchFrame(driver);
		
		WishListPage w=new WishListPage (driver);
		Thread.sleep(5000);
		w.playButton();
		Thread.sleep(10000);
		w.pauseButton();
		
		utilies.switchBackFrame(driver);
		w.addToWishListButton();
		
		
		
		
		
		
	}

}
