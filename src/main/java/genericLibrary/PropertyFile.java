package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile
{
  public String getPropertyData(String key) throws Throwable
  {
	  Properties p=new Properties();
	  FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
	  p.load(fis);
	  return p.getProperty(key);	// here we add return statement
	  
	 // return key;  we can give like this also
  }
}
