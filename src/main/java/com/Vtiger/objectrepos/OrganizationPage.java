package com.Vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
//Declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgLookUpImg;
	//Initialization
	public OrganizationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getOrgLookUpImg() {
		return orgLookUpImg;
	}
	//Business Library class
	public void clickOnOrgLookUpImg() {
		orgLookUpImg.click();
	}
}
