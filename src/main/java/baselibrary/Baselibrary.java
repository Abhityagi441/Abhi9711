package baselibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import screenshot_utility.Screenshot_utility;


public class Baselibrary
{

	public static WebDriver driver;
	public void getlaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\Automation_test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void teardown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	@AfterMethod
	public void resultanalysis(ITestResult result)
	{
		String methodname=result.getMethod().getMethodName();
		if(result.isSuccess())
		{
			Screenshot_utility.getscreenshot(methodname, "Passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshot_utility.getscreenshot(methodname, "Failed");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Screenshot_utility.getscreenshot(methodname, "SKIP");
		}
	}
}
