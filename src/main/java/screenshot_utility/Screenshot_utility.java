package screenshot_utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baselibrary.Baselibrary;

public class Screenshot_utility extends Baselibrary
{
public static void getscreenshot(String filename, String foldername)
{
	String location=System.getProperty("user.dir");
	try {
		String path=location+"\\Screenshots\\"+foldername+"\\"+filename+".png";
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File src=efw.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	} 
	catch (Exception e) 
	{
		System.out.println("issue in getscreenshot method "+e);
	}
	
}
}
