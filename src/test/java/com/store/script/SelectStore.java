/**
 * 
 */
package com.store.script;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.action.engine.ActionEngine;
import com.store.page.SelectStorePage;

/**
 * 
 * @author Murari_Kumar
 *
 */
public class SelectStore extends ActionEngine {

	
	@Test(priority = 1)
	public void checkStoreNameExistance() {

		SelectStorePage existance = PageFactory.initElements(driver, SelectStorePage.class);

		existance.checkStoreNameExistance();

	}
	//@Test(priority = 2)
	public void verifyAllStoreIsClickableOrNot() {

		SelectStorePage checkClickability = PageFactory.initElements(driver, SelectStorePage.class);

		checkClickability.verifyAllStoreIsClickableOrNot();
	}

	//@Test(priority = 3)
	public void checkBackButtonRedirection() {

		SelectStorePage storeNamePage = PageFactory.initElements(driver, SelectStorePage.class);

		storeNamePage.checkBackButton();

	}

}
