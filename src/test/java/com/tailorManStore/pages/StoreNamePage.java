/**
 * 
 */
package com.tailorManStore.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.action.engine.ActionEngine;

/**
 * @author Murari
 *
 */

public class StoreNamePage extends ActionEngine {

	@FindBy(how = How.XPATH, using = "//div[@class='option']")
	List<WebElement> getAllStoreName;

	@FindBy(how = How.XPATH, using = "//h1[text()='Customer']")
	WebElement CustomerPage;

	@FindBy(how = How.XPATH, using = "//a[@class='back']")
	WebElement BackButton;

	@FindBy(how = How.XPATH, using = "//h1[text()='Tailorman']")
	WebElement tailorManHeading;
	@FindBy(how = How.XPATH, using = "//h1[text()='Select Store']")
	WebElement StoreNamePage;

	@FindBy(how = How.XPATH, using = "//a[text()='Store Ops']")
	WebElement StoreOpsLink;

	public WebElement getDynamicStoreName(int i) {
		WebElement StoreNameLoc;

		String dynamicLocator = "(//div[@class='option'])[" + i + "]";

		String storeNameLoc = dynamicLocator.trim();

		return StoreNameLoc = driver.findElement(By.xpath(storeNameLoc));

	}

	public void clickOnStore(String PassStoreName) {
		
		int numOfStore = getAllStoreName.size();

		if (PassStoreName != null) {

			for (int i = 1; i <= numOfStore; i++) {

				String actualStoreNaame = getDynamicStoreName(i).getText();

				if (actualStoreNaame.equalsIgnoreCase(PassStoreName)) {
					
					//System.out.println(actualStoreNaame);

					ActionEngine.scrollIntoView(getDynamicStoreName(i));

					getDynamicStoreName(i).click();

					break;

				}

			}
		} else if (PassStoreName == null) {

			System.out.println("STORE NAME MISSING PLS PASS STORE NAME");
		}
	}
	// actual test Case

	public void AfterClickingOnStore_VerifyPage(String passStoreName, String expectedText) {

		ActionEngine.waitForElementVisibility(StoreOpsLink);

		StoreOpsLink.click();

		clickOnStore(passStoreName);

		ActionEngine.waitForElementVisibility(CustomerPage);

		ActionEngine.verifyElementExistance(CustomerPage, expectedText);

	}

	public void checkBackButton() {

		ActionEngine.waitForElementVisibility(BackButton);

		BackButton.click();

		ActionEngine.waitForElementVisibility(StoreNamePage);

	}

}
