package cm.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.objectrepos.HomePage;
import com.Vtiger.objectrepos.LoginPage;

public class Base {
	public PropertyFileUtility putil=new PropertyFileUtility();
	public ExcelFileUtility eutil= new ExcelFileUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
//Run time polymorphsim
	public WebDriver driver=null;
	
@BeforeSuite
public void bsconfig() {
//is used for open the DataBase connection
	Reporter.log("== DATABASE CONNECTION==",true);
}
@AfterSuite
public void asconfig() {
	//is used for close the DataBase Connection
	Reporter.log("== DATABASE DISCONNECTION==",true);
}
//Run Time Polymorphism
@BeforeClass
public void bcconfig() throws Throwable {
	//is used for launching the browser connection
	String BROWSER = putil.readDataFromPF("browser");
	String URL = putil.readDataFromPF("url");
//RUN Time polymorphism
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
		Reporter.log("Chrome browser has launched",true);
	}
	else if(BROWSER.equals("edge")) {
		driver =new EdgeDriver();
		Reporter.log("Edge browser has been launched",true);
	}
	else if(BROWSER.equals("firefox")) {
		driver = new FirefoxDriver();
		Reporter.log("Firefox browser has been launched",true);
	}
	else {
		Reporter.log("You have given the invalid browser address, please check it once");
	}
	driver.get(URL);
	wutil.maximimizeWindow(driver);
	wutil.waitForPageLoad(driver);
	Reporter.log("Launch browser",true);
}
@AfterClass
public void tearDown() {
	//is used for closing the browser connection
	driver.quit();
	Reporter.log("Close Browser");
}
@BeforeMethod
public void LoginToAPP() throws Throwable {
	//is used for login the application
	String UN = putil.readDataFromPF("un");
	String PWD= putil.readDataFromPF("pwd");
	LoginPage lp=new LoginPage(driver);
	lp.loignToApp(UN, PWD);
	Reporter.log("User gets login to the app successfully",true);
}
@AfterMethod
public void logoutFromapp() {
	//used for logout the application
	HomePage hp=new HomePage(driver);
	hp.logoutfromApp(driver);
	Reporter.log("User gets logout from the application successfully",true);
	
}


}
