/**
 * 
 */
package com.store.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.action.engine.ActionEngine;

/**
 * @author Murari
 *
 */
public class LoginPage extends ActionEngine {

	@FindBy(how = How.LINK_TEXT, using = "Login")
	WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//h1[text()='Sign in']")
	WebElement signInText;

	@FindBy(how = How.ID, using = "identifierId")
	WebElement userName;

	@FindBy(how = How.XPATH, using = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//h1[text()='Welcome']")
	WebElement welcomeText;

	@FindBy(how = How.XPATH, using = "//h1[text()='Tailorman']")
	WebElement tailorManHeading;

	public String loginTailorManStore(String userNameValue, String passwordValue) {

		ActionEngine.click(loginButton);

		ActionEngine.HandleWindow();
		ActionEngine.waitForElementVisibility(signInText);

		userName.sendKeys(userNameValue);
		ActionEngine.click(nextButton);
		ActionEngine.waitForElementVisibility(welcomeText);

		ActionEngine.HandleWindow();
		ActionEngine.sendKeys(password, passwordValue);

		ActionEngine.click(nextButton);
		ActionEngine.waitForElementVisibility(tailorManHeading);

		return ActionEngine.getText(tailorManHeading);

	}

}
