package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Alertspage;

public class Alertstest 
{
	Alertspage ob;
	@BeforeTest
	public void getalerts()
	{
		ob= new Alertspage();
	}
	@Test(priority = 0)
	public void clickonalertbtn() 
	{
		ob.clickonalertbtn();
	}
	@Test(priority = 1)
	public void alert1()
	{
		ob.alert1();
	}
	@Test(priority = 2)
	public void alert2()
	{
		ob.alert2();
	}
	@Test(priority = 3)
	public void alert3()
	{
		ob.alert3();
	}
	@Test(priority = 4)
	public void alert4()
	{
		ob.alert4();
	}
}
