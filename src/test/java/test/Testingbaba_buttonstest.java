package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_buttonspage;

public class Testingbaba_buttonstest 
{
	Testingbaba_buttonspage ob;
	@BeforeTest
	public void getbtns()
	{
		ob=new Testingbaba_buttonspage();
	}
	@Test(priority = 0)
	public void clickonbtns()
	{
		ob.clickonbtns();
	}
	@Test(priority = 1)
	public void clickondbl_rght_lftclck()
	{
		ob.clickondblclck();
	}
}
