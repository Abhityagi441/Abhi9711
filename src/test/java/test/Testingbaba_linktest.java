package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_linkpage;

public class Testingbaba_linktest 
{
	Testingbaba_linkpage ob;
	@BeforeTest
	public void getlinks()
	{
		ob= new Testingbaba_linkpage();
	}
	@Test(priority = 0)
	public void clickonlnksbtn()
	{
		ob.clickonlnksbtn();
	}
	@Test(priority = 1)
	public void clickondemopage() throws InterruptedException
	{
		ob.clickondemopage();
	}
}
