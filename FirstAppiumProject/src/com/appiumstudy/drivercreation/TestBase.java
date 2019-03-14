package com.appiumstudy.drivercreation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.appiumstudy.pages.LoginPage;
import com.appiumstudy.pages.LoginPageWithPageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TestBase {
	
	public AppiumDriver<MobileElement> driver;
	public WebDriverWait wait;
	public DesiredCapabilities capabilities = new DesiredCapabilities();
	public LoginPage loginPage;
	public LoginPageWithPageFactory loginPageFactory;
	
	@BeforeTest
	public void setUp() {
		
		capabilities.setCapability("deviceName", "Samsung Galaxy S7");
		capabilities.setCapability("os_version", "6.0.1");
		capabilities.setCapability("device_id", "ce0117113206301b0c");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", false);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 30);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		loginPage = new LoginPage(driver,wait);
		//loginPageFactory = new LoginPageWithPageFactory( new AppiumFieldDecorator(driver));

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
