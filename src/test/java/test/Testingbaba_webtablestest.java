package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_webtablespage;

public class Testingbaba_webtablestest 
{
	Testingbaba_webtablespage ob;
	@BeforeTest
	public void getwebtable()
	{
		ob=new Testingbaba_webtablespage();
	}
	@Test(priority = 0)
	public void clickonwebtables() 
	{
		ob.clickonwebtables();
	}
	@Test(priority = 1)
	public void filldetails()
	{	
		ob.filldetails();
	}
	@Test(priority = 2)
	public void clickonedit() 
	{
		ob.clickonedit();
	}
}
