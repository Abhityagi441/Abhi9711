package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Framespage;

public class Framestest 
{
	Framespage ob;
	@BeforeTest
	public void getframe()
	{
		ob= new Framespage();
	}
@Test
public void enterinframe()
{
	ob.enterinframe();
}
}
