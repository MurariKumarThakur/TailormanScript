/**
 * 
 */
package com.store.page;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.action.engine.ActionEngine;

/**
 * @author Murari
 *
 */
public class HomePage extends ActionEngine {

	@FindBy(how = How.XPATH, using = "//a[@class='logo active']")
	WebElement TailorManLogo;

	@FindBy(how = How.XPATH, using = "//a[text()='Store Ops']")
	WebElement StoreOpsLink;

	@FindBy(how = How.XPATH, using = "//h1[text()='Tailorman']")
	WebElement tailorManHeading;

	@FindBy(how = How.XPATH, using = "//a[text()='Work Orders']")
	WebElement WorkOrdersLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Dashboard']")
	WebElement DashBoardLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Inventory']")
	WebElement InventoryLink;

	@FindBy(how = How.XPATH, using = "//div[@class='hamburger']")
	WebElement LogOutRedirectionLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement LogoutButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	List<WebElement> LogoutButtonList;

	@FindBy(how = How.XPATH, using = "//a[text()='Reset']")
	WebElement ResetButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Reset']")
	List<WebElement> ResetButtonList;

	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement selectStorePage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Order Workflow']")
	WebElement WorkOrdersPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Dashboard']")
	WebElement DashBoardPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Inventory']")
	WebElement InventoryPage;

	@FindBy(how = How.XPATH, using = "//a[@class='back']")
	WebElement BackButton;

	public void checkFieldExistance(WebElement elmName) {
		boolean expectedResult = true;
		ActionEngine.waitForElementVisibility(elmName);
		boolean fieldIsDisplay = elmName.isDisplayed();
		Assert.assertEquals(fieldIsDisplay, expectedResult);
	}

	public void checkHomePageFieldExistance() {
		checkFieldExistance(TailorManLogo);
		checkFieldExistance(LogOutRedirectionLink);
		checkFieldExistance(tailorManHeading);
		checkFieldExistance(StoreOpsLink);
		checkFieldExistance(WorkOrdersLink);
		checkFieldExistance(DashBoardLink);
		checkFieldExistance(InventoryLink);

	}

	public void checkRedirection(WebElement elm_Clickable, WebElement elm_verification) {
		boolean expectedResult = true;
		elm_Clickable.click();
		ActionEngine.waitForElementVisibility(elm_verification);
		boolean elementIsDisplay = elm_verification.isDisplayed();
		Assert.assertEquals(elementIsDisplay, expectedResult);
		TailorManLogo.click();
		ActionEngine.waitForElementVisibility(StoreOpsLink);
	}

	public void CheckAllLinkIsRedirectingToCorrectPageOrNot() {
		checkRedirection(StoreOpsLink, selectStorePage);
		checkRedirection(WorkOrdersLink, WorkOrdersPage);
		checkRedirection(DashBoardLink, DashBoardPage);
		checkRedirection(InventoryLink, InventoryPage);
		checkRedirection(LogOutRedirectionLink, ResetButton);
		LogOutRedirectionLink.click();
	}
}