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
	

	@FindBy (how = How.XPATH , using="//div[@class='option']")
	List<WebElement>getAllStoreName ;
	

	
	
	public WebElement getDynamicStoreName(int i)
	{
		  WebElement StoreNameLoc ;
		 
		String dynamicLocator = "(//div[@class='option'])["+i+"]" ;
		
		String storeNameLoc =  dynamicLocator.trim();
		
	 return StoreNameLoc =	driver.findElement(By.xpath(storeNameLoc));
	  	
	}
	
	public void clickOnStore(String PassStoreName)
	{
		int numOfStore = getAllStoreName.size();
		
		     for(int i=1;i<=numOfStore;i++)
		     {
		    	
		    	String actualStoreNaame =  getDynamicStoreName(i).getText();
		    	
		    	                   
		    	
		    	 if(actualStoreNaame.equalsIgnoreCase(PassStoreName))
		    	 {
		    		
		    		 getDynamicStoreName(i).click();
		    		 
		    	 	 
		    	 }
		    	 
		     }
		
	
	}
	
	
	
	

}
