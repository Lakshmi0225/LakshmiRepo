package cm.vtiger.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * This method is used to maximize the windows 
	 * @param driver
	 * @author Ankush
	 */
public void maximimizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * This method is used to minimize the window
 * @param driver
 */
public void minimiWindow(WebDriver driver) {
	driver.manage().window().minimize();
}
/**
 * This method wait till entire webpage is loaded
 * @param driver
 */
public void waitForPageLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
/**
 * This method is used to handle the DD with the help of Index
 * @param ele
 * @param index
 */
public void handleDropDown(WebElement ele,int index) {
	Select s=new Select(ele);
	s.selectByIndex(index);
	
}
/**
 *  This method is used to handle the DD with the help of value
 * @param ele
 * @param value
 */
public void handleDropDown(WebElement ele,String value) {
	Select s=new Select(ele);
	s.selectByValue(value);
}
/**
 *  This method is used to handle the DD with the help of text
 * @param text
 * @param ele
 */
public void handleDropDown(String text,WebElement ele) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
/**
 * This method is used to Move the cursor
 * @param driver
 * @param element
 */
public void moveToElement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
}
/**
 * This method is used to do the right click operation
 * @param driver
 * @param element
 */
public void rightClickonelement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
}
/**
 * This method is used to Click on element
 * @param driver
 * @param element
 */
public void doubleClickonelement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.click(element).perform();
}
/**
 * This method is used for drag and drop purpose
 * @param driver
 * @param srcele
 * @param destele
 */
public void dragandDrop(WebDriver driver,WebElement srcele,WebElement destele) {
	Actions a=new Actions(driver);
	a.dragAndDrop(srcele,destele).perform();
}
public void getscreenshot(WebDriver driver) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./"+"\\Screenshots\\vtiger.png");
	try {
		Files.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
