package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Testingbaba_buttonspage extends Baselibrary
{
public Testingbaba_buttonspage() 
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='buttons']")
private WebElement btnsbtn;
@FindBy(xpath="//*[@ondblclick=\"doubletext()\"]")
private WebElement dblclck;
@FindBy(xpath="//*[@oncontextmenu=\"righttext()\"]")
private WebElement rghtclck;
@FindBy(xpath="//*[@onclick=\"clicktext()\"]")
private WebElement lftclck;
public void clickonbtns()
{
	Application_utility.clickonelement(btnsbtn);
}
public void clickondblclck()
{
	Application_utility.doubleclick(dblclck);
	Application_utility.rightclick(rghtclck);
	Application_utility.clickonelement(lftclck);
}
}
