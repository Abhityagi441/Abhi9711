package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_loginpage;

public class Testingbaba_logintest extends Baselibrary
{

	Testingbaba_loginpage ob;
	
	@BeforeTest
	
		public void getlauch_url()
		{
			getlaunch("https://testingbaba.com/");
			ob= new Testingbaba_loginpage();
		}
	//click on  close btn is in process...
	@Test(priority = 0 )
	public void clickonclosebtn()
	{
		
		ob.clickonclosebtn();
	}
	@Test(priority = 1)
	public void clickonpracticeform()
	{
		//click on practiceform....
		ob.clickonpracticeform();
	}
	

}
