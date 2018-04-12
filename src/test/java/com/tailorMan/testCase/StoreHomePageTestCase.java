/**
 * 
 */
package com.tailorMan.testCase;

import java.lang.reflect.Method;

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
	
	
	
	
	// page text 
	
	String StoreopsText = "STORE OPS";
	String workOrderText = "WORK ORDERS";
	String dashBoardText = "DASHBOARD";
	String InventoryText = "INVENTORY";
	
	
	
	
	
	
	
	
	
	
	@Test(priority =1 )
	public void VerifyTextOnStoreHomePage()
	{
	
		StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);
		
	  storePage.verifyTailorManLogo();
	  
	  storePage.verifyStoreOpsLinkExistance(StoreopsText);
	  
	  storePage.verifyWorkOrderLinkExistance(workOrderText);
	  
	  storePage.verifyDashBoardLinkExistance(dashBoardText);
	  
	  storePage.verifyInventoryLinkExistance(InventoryText);
	  
	  
		
		
	}
	
	@Test(priority=2)
	public void verifyLogoutPage(Method m)
	{
 
		StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);	
	storePage.verifyLogOutpage(m);
		
	}
	
	@Test(priority=3)
    public void verifyLinkRedirection()
    {
		StoreHomePage storePage =	PageFactory.initElements(driver, StoreHomePage.class);	 
     
    storePage.verifyStoreLinkRedirection();	
    
    storePage.verifyWorkOrderLinkRedirection();
    
    storePage.verifyDashBoardLinkRedirection();
    
    storePage.verifyInventoryLinkRedirection();
    	
    	
    	
    }
    
}
