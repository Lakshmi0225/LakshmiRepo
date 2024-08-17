package Examples;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Reporter;

import com.Vtiger.objectrepos.CreateNewOrganizationPage;
import com.Vtiger.objectrepos.HomePage;
import com.Vtiger.objectrepos.OrganizationInformationPage;
import com.Vtiger.objectrepos.OrganizationPage;

import cm.vtiger.genericUtilities.Base;

public class organizationTest extends Base{
@Test
public void CreateOrg() {
	HomePage hp =new HomePage(driver);
	//click on organization link
	hp.clickOnOrgLink();
	//click on lookup image
	OrganizationPage og= new OrganizationPage(driver);
	og.clickOnOrgLookUpImg();
	//Give org name and save it
	CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
	cnop.clickOnCreateNewOrg("TCS"+jutil.getRandomNum());
//for validation get header text
OrganizationInformationPage oip=new OrganizationInformationPage(driver);
String header=oip.getHeader();
SoftAssert sa=new SoftAssert();
sa.assertTrue(header.contains("TCS"));
Reporter.log("== ORGANIZATION HAS BEEN CREATED SUCCESSFULLY ==");
sa.assertAll();
}
}
