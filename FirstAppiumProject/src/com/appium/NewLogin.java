package com.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;

public class NewLogin {

	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	public void setUp() {
		//
//				capabilities.setCapability("deviceName", "Redmi Note_5_Pro");
//				capabilities.setCapability("os_version", "8.1.0");
//				capabilities.setCapability("device_id", "62a8f49a");
//				capabilities.setCapability("newCommandTimeout", 12000);
//				capabilities.setCapability("appPackage", "com.flipkart.android");
//				capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
//				capabilities.setCapability("fullReset", false);
//				capabilities.setCapability("noReset", false);
				
				DesiredCapabilities cap = new DesiredCapabilities(); 
		        cap.setCapability("deviceName", "Device"); 
		        cap.setCapability("udid", "62a8f49a"); 
		        cap.setCapability("appPackage", "com.flipkart.android"); 
		        cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		        cap.setCapability("fullReset", false);
				cap.setCapability("noReset", false);
	
	
				try {
					driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
					wait = new WebDriverWait(driver, 30);

				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
	}
	@Test(description = "This method verify addition of two number")
	public void verify_LoginToFlipKart() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.google.android.gms:id/cancel"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.flipkart.android:id/btn_mlogin"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.flipkart.android:id/btn_mlogin"))).click();
		try {
			WebElement element = wait.until(
					ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.google.android.gms:id/cancel"))));
			if (element != null) {
				element.click();
			}
		} catch (Exception e) {
		
		}
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/mobileNo")))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/mobileNo")))).sendKeys("8121236548");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.flipkart.android:id/et_password"))).sendKeys("asdfghjkl");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById("com.flipkart.android:id/btn_mlogin"))).click();
		Thread.sleep(5000);

		
	}
	
	public void tearDown() {
		driver.quit();
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		NewLogin nl=new NewLogin();
		nl.setUp();
		nl.verify_LoginToFlipKart();
		nl.tearDown();
	}
}
