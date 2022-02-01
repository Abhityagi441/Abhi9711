package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_elementpage extends Baselibrary
{
public Testingbaba_elementpage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
private WebElement elements;
public void clickonelements()
{
	elements.click();
}
}
