package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;

public class Framespage extends Baselibrary
{
public Framespage() 
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='nested frames']")
private WebElement nested_framebtn;
@FindBy(xpath="//*[@src=\"example.html\"]")
private WebElement childframe;
@FindBy(xpath="//*[@src=\"text.html\"]")
private WebElement parentframe;
@FindBy(xpath="//*[text()='Click Here']")
private WebElement clickhere;
@FindBy(xpath="//*[text()='Parent']")
private WebElement parenttext;
@FindBy(xpath="//*[text()='Child']")
private WebElement childtext;
@FindBy(xpath="//*[text()='Hello']")
private WebElement resulttext;

@FindBy(xpath="//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[15]/iframe[1]")
private WebElement parent_parentframe;
public void enterinframe()
{
	nested_framebtn.click();
	//driver.switchTo().frame(parent_parentframe);
	Application_utility.switchtoframe(parent_parentframe);
	Application_utility.switchtoframe(parentframe);
	//driver.switchTo().frame(parentframe);
	String text=parenttext.getText();
	System.out.println(text);
	//driver.switchTo().defaultContent();
	Application_utility.switchtoframe(childframe);
	System.out.println(childtext.getText());
	//driver.switchTo().frame(childframe);
	clickhere.click();
	System.out.println(resulttext.getText());
}
}
