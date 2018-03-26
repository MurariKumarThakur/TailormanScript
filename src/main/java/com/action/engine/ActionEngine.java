package com.action.engine;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.engine.DriverEngine;

import com.helper.utility.GetExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends DriverEngine{
	
	
	public static void navigateToUrl(String enterUrl){
		
		driver.get(enterUrl);
		
		
	}
	
	public static String getCurrentUrl(){
		
		
	  return	driver.getCurrentUrl();
	}
	
	
	public static void click(WebElement name ){
		
	         name.click();
	   
	GetExtentReport.logger.log(LogStatus.INFO, "Clicked on Element");       
		
	}

   public static String   getTitle(){
	   
	   return driver.getTitle(); 
	   
	
	   
	  
   }



}
