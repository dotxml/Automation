package com.hike.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.hike.pages.MainPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DriverSetUp {

	public AndroidDriver<MobileElement> driver;
	public DesiredCapabilities cap=new DesiredCapabilities();
	public WebDriverWait wait;
	public MainPage mainPage;
	
	@BeforeTest
	public void setUp(){
 
		DesiredCapabilities cap = new DesiredCapabilities(); 
        cap.setCapability("deviceName", "Device"); 
        cap.setCapability("udid", "62a8f49a"); 
        cap.setCapability("appPackage", "com.bsb.hike"); 
        cap.setCapability("appActivity", "com.bsb.hike.ui.HomeActivity");
        cap.setCapability("fullReset", false);
		cap.setCapability("noReset", false);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			wait = new WebDriverWait(driver, 30);
			mainPage=new MainPage(new AppiumFieldDecorator(driver));

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
//	@AfterTest
//	public void tearDown(){
//		driver.quit();
//	}
}
