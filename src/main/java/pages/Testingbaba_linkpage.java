package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Testingbaba_linkpage extends Baselibrary
{
public Testingbaba_linkpage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='links']")
private WebElement lnksbtn;
@FindBy(xpath="//*[text()='Demo Page']")
private WebElement demolnk;
public void clickonlnksbtn()
{
	Application_utility.clickonelement(lnksbtn);
}
public void clickondemopage() throws InterruptedException 
{
	Thread.sleep(2000);
	demolnk.click();
	Thread.sleep(2000);
	Application_utility.windowclose(1);
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	Application_utility.windowclose(0);
}
}
