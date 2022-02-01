package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Testingbaba_checkbox_page extends Baselibrary
{
public Testingbaba_checkbox_page()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='check box']")
private WebElement checkbox;
@FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
private WebElement checkboxframe;
@FindBy(xpath="//*[@id=\"myCheck\"]")
private WebElement mobile;
@FindBy(xpath="//*[@id=\"mylaptop\"]")
private WebElement laptop;
@FindBy(xpath="//*[@id=\"mydesktop\"]")
private WebElement desktop;
public void clickoncheckbox() throws InterruptedException
{
	Thread.sleep(2000);
	checkbox.click();
}
public void clickonmobile()    
{
	Application_utility.switchtoframe(checkboxframe);
	Application_utility.clickonelement(mobile);
}
public void clickonlaptop()    
{ 
	Application_utility.clickonelement(laptop);
}
public void clickondesktop()    
{ 
	Application_utility.clickonelement(desktop);
	Application_utility.switchtodefault();
}
}
