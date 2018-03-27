package com.action.engine;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.engine.DriverEngine;

import com.helper.utility.GetExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends DriverEngine {
 public  static 	WebDriverWait wait;

	public static void navigateToUrl(String enterUrl) {

		driver.get(enterUrl);

	}

	public static String getCurrentUrl() {

		return driver.getCurrentUrl();
	}

	public static void click(WebElement name) {

		name.click();

		GetExtentReport.logger.log(LogStatus.INFO, "Clicked on Element");

	}

	public static String getTitle() {

		return driver.getTitle();

	}
	
	public static void clear(WebElement name )
	{
		
       name.clear();
	}
	
	
	
	public static void sendKeys(WebElement name , String data ){
		
		
		name.sendKeys(data);
	}
	
	
	public static  void waitForElementVisibility(WebElement locator) {

		wait = new WebDriverWait(driver, 35);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(locator));

	}

	public static  void waitForElementClickable(WebElement locator) {

		wait = new WebDriverWait(driver, 35);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

}
