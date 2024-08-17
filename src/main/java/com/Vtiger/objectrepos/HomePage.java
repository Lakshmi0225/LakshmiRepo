package com.Vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cm.vtiger.genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
//Declaration
	@FindBy(linkText="Organizations")private WebElement OrganizationLnk;
	@FindBy(linkText="Contacts")private WebElement ContactsLnk;
	@FindBy(linkText="Opportunities")private WebElement OpportunitiesLnk;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement AdministratorImg;
	@FindBy(linkText = "Sign Out")private WebElement SignOutLnk;
//Initialization
public HomePage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
//Utilization
public WebElement getOrganizationLnk() {
	return OrganizationLnk;
}
public WebElement getContactsLnk() {
	return ContactsLnk;
}
public WebElement getOpportunitiesLnk() {
	return OpportunitiesLnk;
}
public WebElement getAdministaratorImg() {
	return AdministratorImg;
}
public WebElement getSignOut() {
	return SignOutLnk;
}
public void clickOnOrgLink() {
	OrganizationLnk.click();	
}
public void clickOnContactsLink() {
	ContactsLnk.click();
}
public void clickOnOpportunitiesLink() {
	OpportunitiesLnk.click();
}
//public void logoutFromAPP(WebDriver driver) {
//moveToElement(driver, AdministaratorImg);
//SignOut.click();
public void logoutfromApp(WebDriver driver) {
	moveToElement(driver, AdministratorImg);
	SignOutLnk.click();
}
}
