package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import application_utility.Application_utility;
import baselibrary.Baselibrary;
import excel_utility.Excelutility;

public class Testingbaba_webtablespage extends Baselibrary
{
String path="C:\\Users\\dell\\eclipse-workspace\\Automation_test\\test_result\\testingbaba.xlsx";
public Testingbaba_webtablespage() 
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[text()='web tables']")
private WebElement webtablesbtn;
@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
private WebElement webtablesframe;
@FindBy(xpath="//*[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
private WebElement name;
@FindBy(xpath="//*[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
private WebElement email;
@FindBy(xpath="//*[text()='Save']")
private WebElement savebtn;
@FindBy(xpath="//*[text()='Edit']")
private List<WebElement> editbtn;
@FindBy(xpath="//*[@name=\"edit_name\"]")
private WebElement editbtn1;
@FindBy(xpath="//*[text()='Update']")
private WebElement updatebtn;
public void clickonwebtables()
{
	webtablesbtn.click();
}
public void filldetails() 
{
	
	driver.switchTo().frame(webtablesframe);
	for(int i=1;i<6;i++)
	{
		name.sendKeys(Excelutility.getdata(path, i, 0));
		email.sendKeys(Excelutility.getdata(path, i, 1));
		savebtn.click();
	}
}
public void clickonedit() 
{
	
	for(WebElement dd:editbtn)
	{
		dd.click();
	}
		for(int j=1;j<6;j++)
		{
			editbtn1.clear();
			editbtn1.sendKeys(Excelutility.getdata(path, j, 2));
			updatebtn.click();
		}	
		Application_utility.switchtodefault();
	}
}


