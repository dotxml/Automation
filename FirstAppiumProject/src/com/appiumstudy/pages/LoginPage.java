package com.appiumstudy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage {
	
	private AppiumDriver<MobileElement> driver;
	private WebDriverWait wait;
	
	private By USERNAME = By.id("com.flipkart.android:id/mobileNo");
	private By PASSWORD = By.id("com.flipkart.android:id/et_password");
	private By NONE_OF_THE_ABOVE = By.id("com.google.android.gms:id/cancel");
	private By SIGN_IN = By.id("com.flipkart.android:id/btn_mlogin");
	private By EXISTING_USER_SIGN_IN = By.id("com.flipkart.android:id/btn_mlogin");
	
	
	public LoginPage(AppiumDriver<MobileElement> driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void click_UsernameTextBox() {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement((USERNAME))));
		if(element != null) {
			element.click();
		}
	}
	public void enterUserName(String userName) {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(USERNAME)));
		if(element != null) {
			element.click();
			element.clear();
			element.sendKeys(userName);
		}
	}
	
	public void enterPassword(String password) {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(PASSWORD)));
		if(element != null) {
			element.click();
			element.clear();
			element.sendKeys(password);
		}
	}
	
	public void click_None_Of_The_Above() {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(NONE_OF_THE_ABOVE)));
		if(element != null) {
			element.click();
		}
	}
	
	public void click_Sign_In_Button() {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SIGN_IN)));
		if(element != null) {
			element.click();
		}
	}
	
	public void click_Existing_User_Button() {
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(EXISTING_USER_SIGN_IN)));
		if(element != null) {
			element.click();
		}
	}
	
	
}
