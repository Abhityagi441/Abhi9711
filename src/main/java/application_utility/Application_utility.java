package application_utility;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;



public class Application_utility extends Baselibrary
{
public static void clickonelement(WebElement ele)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.click();
}
public static void sendkeystome(WebElement ele, String value)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.sendKeys(value);
}
public static void switchtoframe(WebElement ele)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
}

public static void doubleclick(WebElement ele)
{
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
}
public static void rightclick(WebElement ele) 
{
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
}
public static void windowclose(int tabno)
{
	Set<String> dd = driver.getWindowHandles();
	ArrayList<String> tabs=new ArrayList<String>(dd);
	driver.switchTo().window(tabs.get(tabno));
}
public static void switchtodefault()
{
	driver.switchTo().defaultContent();
}
public static void dropdown(WebElement ele, String value)
{
	Select sel= new Select(ele);
	sel.selectByVisibleText(value);
}
}
