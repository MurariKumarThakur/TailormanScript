package com.base.engine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.action.engine.ActionEngine;
import com.helper.utility.GetExtentReport;
import com.path.manager.pathManager;
import com.store.page.LoginPage;

public class DriverEngine {
	public static RemoteWebDriver driver;

	@BeforeSuite
	@Parameters("browserName")
	public static void openBrowser(@Optional("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", pathManager.chromeDriverPath);
			driver = new ChromeDriver();

			initialBrowserCommand();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdirver.geco.driver", pathManager.firfoxDriverPath);

			driver = new FirefoxDriver();
			initialBrowserCommand();
		} else if (browserName.equalsIgnoreCase("ie")) {

			System.setProperty("webdirver.geco.driver", pathManager.iEDriverPath);

			driver = new InternetExplorerDriver();

			initialBrowserCommand();

		}

	}

	public static void initialBrowserCommand() {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// driver.manage().deleteAllCookies();

		driver.get(pathManager.config.getPropertyFileValue("tailorManStoreUrl"));
		StoreLogin();
	}

	public static void StoreLogin() {
		String login = "Login";
		String email = "//input[@name='identifier']";
		String next = "//span[text()='Next']";
		String password = "//input[@name='password']";
		String tailormanHeading = "//h1[text()='Tailorman']";
		WebElement loginField = driver.findElementByLinkText(login);
		ActionEngine.waitForElementVisibility(loginField);
		loginField.click();
		WebElement emailField = driver.findElementByXPath(email);
		ActionEngine.waitForElementVisibility(emailField);
		emailField.sendKeys(pathManager.config.getPropertyFileValue("userName"));

		WebElement nextLink = driver.findElementByXPath(next);

		nextLink.click();

		WebElement passwordLink = driver.findElementByXPath(password);
		ActionEngine.waitForElementVisibility(passwordLink);
		passwordLink.sendKeys(pathManager.config.getPropertyFileValue("password"));

		WebElement nextLink2 = driver.findElementByXPath(next);

		nextLink2.click();

		WebElement tailormanHeading_link = driver.findElementByXPath(tailormanHeading);

		ActionEngine.waitForElementVisibility(tailormanHeading_link);
	}

	@AfterSuite
	public void endSuite() {

		GetExtentReport.endReport();
		driver.get(GetExtentReport.reportUrl);

	}

	@AfterMethod
	public void startMethod(ITestResult result) {

		GetExtentReport.getStatus(result);

	}

}
