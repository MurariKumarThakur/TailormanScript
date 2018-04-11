/**
 * 
 */
package com.tailorMan.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.action.engine.ActionEngine;
import com.path.manager.pathManager;
import com.tailorManStore.pages.LoginPage;

/**
 * @author Murari
 *
 */
public class LoginTestCase extends ActionEngine {
	
	
	  static String TailorManHomePageHeading = "Tailorman";
	
	
	
	

	@Test(priority = 1)
	public void openTailorManStore() {

		ActionEngine.navigateToUrl(pathManager.config.getPropertyFileValue("tailorManStoreUrl"));

		String CurrentUrl = ActionEngine.getCurrentUrl();
		Assert.assertTrue(CurrentUrl.contains("login"));
	}

	@Test(priority = 2)
	public void varifyTailorManStoreTitle() {

		String actualTitle = ActionEngine.getTitle();

		String expectedTitle = pathManager.storeData.getSingleExcelCellValue("store", 0, 1);

		Assert.assertEquals(expectedTitle, actualTitle, "TitleNotMacthing");

	}
	@Test(priority=3)
    public static void verifyLogin(){
    	
    LoginPage lp =	PageFactory.initElements(driver, LoginPage.class);
    
    String ActualText =   lp.loginTailorManStore(pathManager.config.getPropertyFileValue("userName"), pathManager.config.getPropertyFileValue("password"));
    
        Assert.assertEquals(ActualText, TailorManHomePageHeading);
        
         
        
       
       
    }

}
