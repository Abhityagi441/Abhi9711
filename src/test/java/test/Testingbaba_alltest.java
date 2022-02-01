package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_buttonspage;
import pages.Testingbaba_checkbox_page;
import pages.Testingbaba_elementpage;
import pages.Testingbaba_linkpage;
import pages.Testingbaba_loginpage;
import pages.Testingbaba_radiobtnpage;
import pages.Testingbaba_textboxpage;
import pages.Testingbaba_webtablespage;

public class Testingbaba_alltest extends Baselibrary
{
	Testingbaba_loginpage ob;
	Testingbaba_elementpage ob1;
	Testingbaba_textboxpage ob2;
	Testingbaba_checkbox_page ob3;
	Testingbaba_radiobtnpage ob4;
	Testingbaba_webtablespage ob5;
	Testingbaba_buttonspage ob6;
	Testingbaba_linkpage ob7;
	@BeforeTest
	public void testingbabagetalltest()
	{
		getlaunch("https://testingbaba.com/");
		ob=new Testingbaba_loginpage();
		ob1= new Testingbaba_elementpage();
		ob2=new Testingbaba_textboxpage();
		ob3=new Testingbaba_checkbox_page();
		ob4=new Testingbaba_radiobtnpage();
		ob5=new Testingbaba_webtablespage();
		ob6=new Testingbaba_buttonspage();
		ob7=new Testingbaba_linkpage();
	}
	
	@Test(priority = 0)
	public void clickonclosebtn()
	{
		ob.clickonclosebtn();
	}
	@Test(priority = 1)
	public void clickonpracticeform()
	{
		ob.clickonpracticeform();
	}
	@Test(priority = 2)
	public void clickonelements()
	{
		ob1.clickonelements();
	}
	@Test(priority = 3)
	public void clickontextbox()
	{
		ob2.clickontextbox();
	}
	@Test(priority = 6)
	public void clickoncheckbox() throws InterruptedException
	{
		ob3.clickoncheckbox();
	}
	@Test(priority = 7)
	public void clickonmobile()    
	{
		ob3.clickonmobile();
	}
	@Test(priority = 8)
	public void clickonlaptop()    
	{ 
		ob3.clickonlaptop();
	}
	@Test(priority = 9)
	public void clickondesktop()    
	{ 
		ob3.clickondesktop();
	}
	@Test(priority = 10)
	public void clickonradiobtn()
	{
		ob4.clickonradiobtn();
	}
	@Test(priority = 11)
	public void clickonwebtables()
	{
		ob5.clickonwebtables();
	}
	@Test(priority = 12)
	public void filldetails() 
	{
	ob5.filldetails();
	}
	@Test(priority = 13)
	public void clickonedit() 
	{
		ob5.clickonedit();
	}
	@Test(priority = 14)
	public void clickonbtns()
	{
	ob6.clickonbtns();
	}
	@Test(priority = 15)
	public void clickondblclck()
	{
	ob6.clickondblclck();
	}
	@Test(priority = 16)
	public void clickonlnksbtn()
	{
	ob7.clickonlnksbtn();
	}
	@Test(priority = 17)
	public void clickondemopage() throws InterruptedException 
	{
		ob7.clickondemopage();
	}
}
