package scripts;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Pompages.SkillaryDemoLoginPage;
import Pompages.SkillaryLoginPage;
import Pompages.TestingPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass
{
   @Test
   public void tc2() throws Throwable
   {
	  SkillaryLoginPage s=new SkillaryLoginPage(driver);
	  s.gearsbutton();
	  s.skillaryDemoApplication();
	  
	  SkillaryDemoLoginPage s1=new  SkillaryDemoLoginPage(driver);
	  utilies.switchingTab(driver);
	  utilies.dropDown(s1.getCoursedropdown(),pdata.getPropertyData("coursedropdown"));
	  
	  TestingPage t=new TestingPage(driver);
	  utilies.dragAndDrop(driver,t.getSeleniumTraning(),t.getCarttab());
	  
	  Point loc = t.getFacebookicon().getLocation();
	  int x = loc.getX();
		 int y=loc.getY();
		 
		 utilies.scrollBar(driver, x, y);
		 t.facebookicon();
	  
	  
			 
      
      
    }
   
}
