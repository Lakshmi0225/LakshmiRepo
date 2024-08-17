package com.Vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
//Declaration

	@FindBy(xpath="//input[@name='accountname']")private WebElement orgNameedt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;
	//Initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrgNameEdt() {
		return orgNameedt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//Business Libray Class
	public void clickOnCreateNewOrg(String orgName){
		orgNameedt.sendKeys(orgName);
		saveBtn.click();
		}
}
