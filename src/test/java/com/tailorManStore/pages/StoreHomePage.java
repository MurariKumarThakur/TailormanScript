/**
 * 
 */
package com.tailorManStore.pages;

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
public class StoreHomePage extends ActionEngine {

	@FindBy(how = How.XPATH, using = "//a[@class='option']")
	List<WebElement> TailorManLogoList;

	@FindBy(how = How.XPATH, using = "//a[text()='Store Ops']")
	WebElement StoreOpsLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Work Orders']")
	WebElement WorkOrdersLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Dashboard']")
	WebElement DashBoardLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Inventory']")
	WebElement InventoryLink;

	@FindBy(how = How.XPATH, using = "//div[@class='hamburger']")
	WebElement LogOutForm;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement LogoutButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	List<WebElement> LogoutButtonList;

	@FindBy(how = How.XPATH, using = "//a[text()='Reset']")
	WebElement ResetButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Reset']")
	List<WebElement> ResetButtonList;

	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement StoreNamePage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Order Workflow']")
	WebElement WorkOrdersPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Dashboard']")
	WebElement DashBoardPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Inventory']")
	WebElement InventoryPage;

	@FindBy(how = How.XPATH, using = "//a[@class='back']")
	WebElement BackButton;

	public void verifyTailorManLogo() {

		int logoExistance = TailorManLogoList.size();

		if (logoExistance > 0) {

			Assert.assertTrue(logoExistance > 0);
		}

		else {
			System.out.println("LOGO IS NOT EXIST");
		}
	}

	public void verifyStoreOpsLinkExistance(String expectedResult) {

		ActionEngine.verifyElementExistance(StoreOpsLink, expectedResult);

	}

	public void verifyWorkOrderLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(WorkOrdersLink, ExpectedResult);

	}

	public void verifyDashBoardLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(DashBoardLink, ExpectedResult);

	}

	public void verifyInventoryLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(InventoryLink, ExpectedResult);

	}

	public void verifyLogOutpage(Method m) {

		LogOutForm.click();

		ActionEngine.waitForElementVisibility(ResetButton);

		int logOutButtonExistance = LogoutButtonList.size();
		int resetButtonListExistance = ResetButtonList.size();

		if (logOutButtonExistance > 0 && resetButtonListExistance > 0) {
			Assert.assertTrue(logOutButtonExistance > 0 && resetButtonListExistance > 0,
					"BOTH LOGOUT BUTTON AND RESET BUTTON NOT EXIT");
			LogOutForm.click();
		}

		else

		{
			System.out.println(m.getName() + " Method section " + " LOGOUT BUTTON AND RESET BUTTON NOT PRESENT !!!");
			LogOutForm.click();
		}

	}

	/*
	 * 
	 * CHECK PAGE IS REDIRECTED CORRECTLY OR NOT
	 * 
	 * CUSTOME METHOD
	 */

	public void RedirectionPage(WebElement wantToClick, WebElement wantToWait, WebElement wantTowaitAgain) {
		wantToClick.click();

		boolean ElementIsVisiable = wantToWait.isDisplayed();

		if (ElementIsVisiable == true) {
			Assert.assertEquals(ElementIsVisiable, true);

		}

		else

		{

			System.out.println("HEADING IS NOT DISPLAYING");
		}
		BackButton.click();
		ActionEngine.waitForElementVisibility(wantTowaitAgain);

	}

	public void verifyStoreLinkRedirection()

	{

		RedirectionPage(StoreOpsLink, StoreNamePage, StoreOpsLink);

	}

	public void verifyWorkOrderLinkRedirection()

	{
		RedirectionPage(WorkOrdersLink, WorkOrdersPage, WorkOrdersLink);

	}

	public void verifyDashBoardLinkRedirection()

	{

		RedirectionPage(DashBoardLink, DashBoardPage, DashBoardLink);

	}

	public void verifyInventoryLinkRedirection()

	{

		RedirectionPage(InventoryLink, InventoryPage, InventoryLink);

	}
}
