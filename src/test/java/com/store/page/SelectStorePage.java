/**
 * 
 */
package com.store.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.action.engine.ActionEngine;

/**
 * @author Murari
 *
 */

public class SelectStorePage extends ActionEngine {

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
	
	
	    String storeName1 = "Amazon";
	    
	    String storeName2 = "Bangalore Whitefield";
	    
	    String storeName3 = "Online Store";
	    
	    String storeName4 = "Chennai College Road";

	public WebElement getDynamicStoreName(String storeName) {
		WebElement StoreNameLoc;

		String dynamicLocator = "//div[text()='"+storeName+"']";

		String storeNameLoc = dynamicLocator.trim();

		return StoreNameLoc = driver.findElement(By.xpath(storeNameLoc));

	}

	
	public void clickOnStore(String storeName) {

	

	
				if (getDynamicStoreName(storeName)!=null) {

				
					ActionEngine.scrollIntoView(getDynamicStoreName(storeName));

					getDynamicStoreName(storeName).click();

				

				}

				else if(getDynamicStoreName(storeName)==null){
					
					System.out.println("PLEASE PASS STORE NAME ");
				}
	}
	
	
	public void checkFieldExistance(WebElement elmName) {
		
		 ActionEngine.waitForElementVisibility(StoreOpsLink);
		 StoreOpsLink.click();
		boolean expectedResult = true;
		System.out.println(elmName);
		ActionEngine.waitForElementVisibility(elmName);
		boolean fieldIsDisplay = elmName.isDisplayed();
		Assert.assertEquals(fieldIsDisplay, expectedResult);
		
		 
	}

	
	public void checkStoreNameExistance(){
		
		
		
		checkFieldExistance(getDynamicStoreName(storeName1));
		checkFieldExistance(getDynamicStoreName(storeName2));
		checkFieldExistance(getDynamicStoreName(storeName3));
		checkFieldExistance(getDynamicStoreName(storeName4));
	}
	
       public void checkStoreClickableOrNot(String StoreName)
       {
    	   boolean expectedResult = true ;
    	   
    	   clickOnStore(StoreName);
    	ActionEngine.waitForElementVisibility(CustomerPage);   
    	 boolean customerHeadingIsDisplaying =  CustomerPage.isDisplayed();
    	   
    	  Assert.assertEquals(customerHeadingIsDisplaying, expectedResult);
    	   
    	   
       }
       
       
       public void verifyAllStoreIsClickableOrNot()
       {
    	   checkStoreClickableOrNot(storeName1);  
    	   checkStoreClickableOrNot(storeName2);  
    	   checkStoreClickableOrNot(storeName3);  
    	   checkStoreClickableOrNot(storeName4);  
    	   
       }

	public void checkBackButton() {

		ActionEngine.waitForElementVisibility(BackButton);

		BackButton.click();

		ActionEngine.waitForElementVisibility(StoreNamePage);

		
		
		
		
		
		
		
		
		
		
	}

}
