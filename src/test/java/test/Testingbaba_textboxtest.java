package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_textboxpage;

public class Testingbaba_textboxtest 
{
	Testingbaba_textboxpage ob;
	@BeforeTest
	public void gettextbox()
	{
		ob= new Testingbaba_textboxpage();
	}
	@Test(priority = 0)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
}

