/**
 * 
 */
package com.store.script;

import java.lang.reflect.Method;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.action.engine.ActionEngine;
import com.store.page.HomePage;

/**
 * @author Walkingtree
 *
 */
public class HomePageScript extends ActionEngine {
	
	
	@Test(priority=1)
	public void checkHomePageFieldExistance()
	{
		
HomePage elmExistance =	PageFactory.initElements(driver, HomePage.class);
         elmExistance.checkHomePageFieldExistance();
		
	}
	@Test(priority=2)
    public void CheckAllLinkIsRedirectingToCorrectPageOrNot()
    {
    	
    	HomePage  checkelemExistance =	PageFactory.initElements(driver, HomePage.class);
    	checkelemExistance.CheckAllLinkIsRedirectingToCorrectPageOrNot();
    	
    }
}
