/**
 * 
 */
package com.store.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.action.engine.ActionEngine;

/**
 * @author Walkingtree
 *
 */
public class CustomerPage extends ActionEngine {
	

  @FindBy(how = How.XPATH , using ="//h1[text()='Customer']")
    WebElement customerHeading ;
	
  @FindBy(how = How.XPATH , using ="//div[text()='Existing Customers']")
  WebElement existingCustomer ;
  
  @FindBy(how = How.XPATH , using ="//div[text()='New Customer']")
  WebElement newCustomer ;
  
  @FindBy(how = How.XPATH , using ="//div[text()='Pending Amount details']")
  WebElement pendingAmountDetails ;
	
  
  
  
  
  
  
  
    public void verifyHeadingIsDisplayingOrNot(String ExpectedText)
    {
    	
     ActionEngine.verifyElementExistance(customerHeading, ExpectedText);	
    	
    	
    }
    
    public void verifyExistingCustomerLink(String ExpectedText)
    {
    	
    	ActionEngine.verifyElementExistance(existingCustomer, ExpectedText);
    }
    public void verifynewCusotmerLink(String expectedText)
    {
    	
    	ActionEngine.verifyElementExistance(newCustomer, expectedText);
    	
    }
    public void verifyPendingAmountDetails(String expectedText)
    {
    	
    	ActionEngine.verifyElementExistance(pendingAmountDetails, expectedText);
    }
    

}
