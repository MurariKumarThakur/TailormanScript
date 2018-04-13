/**
 * 
 */
package com.tailorMan.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.action.engine.ActionEngine;

import com.tailorManStore.pages.StoreNamePage;

/**
 * 
 * @author Murari_Kumar
 *
 */
public class StoreNameTestCase extends ActionEngine {
	
	
	
	String   storeName = "AMAZON";
	
	String   customerPageHeading = "Customer";
	
	
	
	
	@Test(priority =1)

	public void verifyStoreNamePresentOrNot()
	
	{
		
      
		
  StoreNamePage storeNamePage =    PageFactory.initElements(driver, StoreNamePage.class);	
  
       storeNamePage.AfterClickingOnStore_VerifyPage(storeName, customerPageHeading);
	}
	//@Test(priority=2)
	public void checkBackButtonRedirection()
	{
		
 StoreNamePage storeNamePage =    PageFactory.initElements(driver, StoreNamePage.class);
 
      storeNamePage.checkBackButton();
		
		
	}
	

}
