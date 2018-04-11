/**
 * 
 */
package com.tailorManStore.pages;

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

	@FindBy(how = How.CLASS_NAME, using = "logo active")
	WebElement TailorManLogo;
	
	@FindAll(@FindBy(how = How.CLASS_NAME, using = "logo active"))
	 List<WebElement> TailorManLogoList;

	@FindBy(how = How.XPATH, using = "//a[text()='Store Ops']")
	WebElement StoreOpsLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Work Orders']")
	WebElement WorkOrders;

	@FindBy(how = How.XPATH, using = "//a[text()='Dashboard']")
	WebElement DashBoard;

	

	
	@FindBy(how = How.XPATH, using = "//a[text()='Inventory']")
	WebElement Inventory;

	@FindBy(how = How.XPATH, using = "//div[@class='hamburger']")
	WebElement LogOutForm;

	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement LogoutButton;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//a[text()='Logout']"))
	 List<WebElement> logOutButtonNum;

	@FindBy(how = How.XPATH, using = "//a[text()='Reset']")
	WebElement ResetButton;

	@FindAll(@FindBy(how = How.XPATH, using = "//a[text()='Reset']"))
	 List<WebElement> ResetButtonNum;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement StoreNamePage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement WorkOrdersPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement DashBoardPage;

	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement InventoryPage;

	@FindBy(how = How.XPATH, using = "//a[@class='back']")
	WebElement BackButton;

	public void verifyTailorManLogo() {

	 int logonum =	TailorManLogoList.size();
	 
	 System.out.println(logonum);
	 
	  if(logonum > 0)
	  {
		  Assert.assertTrue(logonum > 0);
		  
	  }else 
		  
	  {
		  
		  System.out.println("LOGO IS NOT DISPLAYING !!! ");
	  }
		  

	}

	public void verifyStoreOpsLinkExistance(String ExpectedResult) {

		ActionEngine.verifyElementExistance(StoreOpsLink, ExpectedResult);
	}

	public void verifyWorkOrderLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(WorkOrders, ExpectedResult);

	}

	public void verifyDashBoardLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(DashBoard, ExpectedResult);

	}

	public void verifyInventoryLinkExistance(String ExpectedResult) {
		ActionEngine.verifyElementExistance(InventoryPage, ExpectedResult);

	}

	public void verifyLogOutpage() {
		
		
		LogOutForm.click();

		ActionEngine.waitForElementVisibility(ResetButton);

		int logoutbuttonExistance = logOutButtonNum.size();
		int ResetbuttonExistance =  ResetButtonNum.size();

		if (logoutbuttonExistance > 0 && ResetbuttonExistance > 0) {

			Assert.assertTrue(logoutbuttonExistance > 0 && logoutbuttonExistance > 0);
			
			LogOutForm.click();

		} else {

			System.out.println("LOGOUT IS  NOT DISPLAYING !!");
			System.out.println("RESET BUTTON IS NOT DISPLAYING !!");
			
			LogOutForm.click();
		}
		
		

	

		
		
		
		
	}
	public void verifyStoreLinkRedirection(String ExpectedResult)

	{

		StoreOpsLink.click();

		ActionEngine.waitForElementVisibility(StoreNamePage);

		ActionEngine.verifyElementExistance(StoreNamePage, ExpectedResult);

		ActionEngine.waitForElementVisibility(StoreOpsLink);
		BackButton.click();

		ActionEngine.waitForElementVisibility(StoreOpsLink);

	}

	public void verifyWorkOrderLinkRedirection(String ExpectedResult)

	{

		WorkOrders.click();

		ActionEngine.waitForElementVisibility(WorkOrdersPage);

		ActionEngine.verifyElementExistance(WorkOrdersPage, ExpectedResult);

		BackButton.click();

		ActionEngine.waitForElementVisibility(WorkOrders);

	}
	
	public void verifyDashBoardLinkRedirection(String ExpectedResult)

	{

		DashBoard.click();

		ActionEngine.waitForElementVisibility(DashBoardPage);

		ActionEngine.verifyElementExistance(DashBoardPage, ExpectedResult);

		BackButton.click();

		ActionEngine.waitForElementVisibility(DashBoard);

	}

	public void verifyInventoryLinkRedirection(String ExpectedResult)

	{

		Inventory.click();

		ActionEngine.waitForElementVisibility(InventoryPage);

		ActionEngine.verifyElementExistance(InventoryPage, ExpectedResult);

		Inventory.click();

		ActionEngine.waitForElementVisibility(DashBoard);
		
		
		
		

	}
}
