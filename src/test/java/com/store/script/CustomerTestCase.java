/**
 * 
 */
package com.store.script;

import org.openqa.selenium.support.PageFactory;

import com.action.engine.ActionEngine;
import com.store.page.CustomerPage;

/**
 * @author Walkingtree
 *
 */
public class CustomerTestCase extends ActionEngine  {
	
	String customerHeading = "Customer" ;
	String ExistingCustomer = "Existing Customers";
	
	
	public void verifyAllElementOnCustomerPage()
	{
		
	CustomerPage customer = PageFactory.initElements(driver, CustomerPage.class);
	
	   customer.verifyHeadingIsDisplayingOrNot(customerHeading);
	 //  customer.verifyExistingCustomerLink();
	   
	  
		
		
	}
	
	
	

}
