package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_loginpage extends Baselibrary
{
public Testingbaba_loginpage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='�']")
private WebElement closebtn;
@FindBy(xpath="//*[text()='Practice']")
private WebElement practiceform;

public void clickonclosebtn()
{
	closebtn.click();
}
public void clickonpracticeform()
{
	practiceform.click();
}
}
