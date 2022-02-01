package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_checkbox_page;

public class Testingbaba_checkbox_test 
{
	Testingbaba_checkbox_page ob;
	@BeforeTest
	public void getcheck()
	{
		ob= new Testingbaba_checkbox_page();
	}
	@Test(priority = 0)
	public void clickoncheckbox() throws InterruptedException 
	{
		ob.clickoncheckbox();
	}
	@Test(priority = 1)
	public void clickonmobile()  
	{
		ob.clickonmobile();
	}
	@Test(priority = 2)
	public void clickonlaptop()  
	{ 
		ob.clickonlaptop();
	}
	@Test(priority = 3)
	public void clickondesktop()  
	{
		ob.clickondesktop();
	}
}
