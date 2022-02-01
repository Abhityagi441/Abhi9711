package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_radiobtnpage;

public class Testingbaba_radiobtntest 
{
	Testingbaba_radiobtnpage ob;
@BeforeTest
public void get_radiobtn()
{
	ob=new Testingbaba_radiobtnpage();
}
@Test(priority = 0)
public void clickonradiobtn()
{
	ob.clickonradiobtn();
}
}
