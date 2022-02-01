package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Testingbaba_alerts_frame_windowpage;

public class Testingbaba_alerts_frame_windowtest 
{
	Testingbaba_alerts_frame_windowpage ob;
	@BeforeTest
	public void getframe_alert_window()
	{
		ob= new Testingbaba_alerts_frame_windowpage();
	}
	@Test(priority = 0)
	public void clickonalert_frame_windowbtn()
	{
		ob.clickonalert_frame_windowbtn();
	}
}
