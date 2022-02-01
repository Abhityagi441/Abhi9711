package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_elementpage;

public class Testingbaba_elementtest 
{
	
	Testingbaba_elementpage ob;
	@BeforeTest
	public void getlaunch()
	{
		ob=new Testingbaba_elementpage();
	}
	
	@Test(priority = 0)
	public void clickonelements()
	{
	ob.clickonelements();
	}
}
