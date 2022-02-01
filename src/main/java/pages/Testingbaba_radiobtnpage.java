package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Testingbaba_radiobtnpage extends Baselibrary
{
public Testingbaba_radiobtnpage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='radio buttons']")
private WebElement radiobtn;
@FindBy(xpath="//*[@id=\"impressive\"]")
private WebElement impresivebtn;
public void clickonradiobtn()
{
	Application_utility.clickonelement(radiobtn);
	impresivebtn.click();
}
}
