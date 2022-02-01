package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Testingbaba_textboxpage extends Baselibrary
{
public Testingbaba_textboxpage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='text box']")
private WebElement textbox;

public void clickontextbox()
{
	Application_utility.clickonelement(textbox);
}
}
