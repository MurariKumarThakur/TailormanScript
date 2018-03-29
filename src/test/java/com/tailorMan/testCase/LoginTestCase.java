/**
 * 
 */
package com.tailorMan.testCase;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.action.engine.ActionEngine;
import com.path.manager.pathManager;

/**
 * @author Murari
 *
 */
public class LoginTestCase extends ActionEngine {

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

}
