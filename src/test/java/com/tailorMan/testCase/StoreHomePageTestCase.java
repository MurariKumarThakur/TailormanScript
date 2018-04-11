/**
 * 
 */
package com.tailorMan.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.action.engine.ActionEngine;
import com.tailorManStore.pages.LoginPage;
import com.tailorManStore.pages.StoreHomePage;

/**
 * @author Walkingtree
 *
 */
public class StoreHomePageTestCase extends ActionEngine {
	
	
	StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);
	
	// page text 
	
	String StoreopsText = "Store Ops";
	String workOrderText = "Work Orders";
	String dashBoardText = "Dashboard";
	String InventoryText = "Inventory";
	
	
	String StoreNamePageRedirection = "Select Store";
	
	String workOrderPageRedirection = "Order Workflow";
	
	String DashBoardPageRedirection = "Dashboard";
	
	String InventoryPageRedirection = "Inventory";
	
	 
	
	
	
	
	
	
	
	@Test(priority =4 )
	public void VerifyTextOnStoreHomePage()
	{
	
 StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);	  
		
	  storePage.verifyTailorManLogo();
	  
	  storePage.verifyStoreOpsLinkExistance("StoreopsText");
	  
	  storePage.verifyWorkOrderLinkExistance(workOrderText);
	  
	  storePage.verifyDashBoardLinkExistance(dashBoardText);
	  
	  storePage.verifyInventoryLinkExistance(InventoryText);
	  
	  
		
		
	}
	/*
	@Test(priority=5)
	public void verifyLogoutPage()
	{
 StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);	
		
	storePage.verifyLogOutpage();	
		
	}
	
	@Test(priority=6)
    public void verifyLinkRedirection()
    {
StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);	 
     
    storePage.verifyStoreLinkRedirection(StoreNamePageRedirection);	
    
    storePage.verifyWorkOrderLinkRedirection(workOrderPageRedirection);
    
    storePage.verifyDashBoardLinkRedirection(DashBoardPageRedirection);
    
    storePage.verifyInventoryLinkExistance(InventoryPageRedirection);
    	
    	
    	
    }
    */
}
