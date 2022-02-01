package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import wait_utility.Wait_utility;

public class Alertspage extends Baselibrary
{
public Alertspage() 
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='alerts']")
private WebElement alertbtn;
@FindBy(xpath="//*[@onclick=\"myalert()\"]")
private WebElement clickme1;
@FindBy(xpath="//*[@onclick=\"aftersec5()\"]")
private WebElement clickme2;
@FindBy(xpath="//*[@onclick=\"myconfirm()\"]")
private WebElement clickme3;
@FindBy(xpath="//*[@id=\"confirm-result\"]")
private WebElement alertresult;
@FindBy(xpath="//*[@onclick=\"myprompt()\"]")
private WebElement clickme4;
@FindBy(xpath="//*[@id=\"name-result\"]")
private WebElement alertresult1;
public void clickonalertbtn()
{
	alertbtn.click();
}
public void alert1()
{
	clickme1.click();
	String data=driver.switchTo().alert().getText();
	System.out.println(data);
	driver.switchTo().alert().accept();
}
public void alert2()
{
	clickme2.click();
	Wait_utility.alertswait(10);
	String data2=driver.switchTo().alert().getText();
	System.out.println(data2);
	driver.switchTo().alert().accept();
}
public void alert3()
{
	clickme3.click();
	String data=driver.switchTo().alert().getText();
	System.out.println(data);
	driver.switchTo().alert().dismiss();
	String data1= alertresult.getText();
	System.out.println(data1);
}
public void alert4()
{
	clickme4.click();
	String data=driver.switchTo().alert().getText();
	System.out.println(data);
	driver.switchTo().alert().sendKeys("Abhi");
	driver.switchTo().alert().accept();
	String data1=alertresult1.getText();
	System.out.println(data1);
}
}
