package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_alerts_frame_windowpage extends Baselibrary
{
public Testingbaba_alerts_frame_windowpage()
{
	PageFactory.initElements(driver, this);
}
@FindBy (xpath="//*[@data-target=\"#alerts\"]")
private WebElement alert_frame_windowbtn;
public void clickonalert_frame_windowbtn()
{
	alert_frame_windowbtn.click();
}
}
