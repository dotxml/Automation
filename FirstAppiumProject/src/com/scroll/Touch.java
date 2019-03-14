package com.scroll;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Touch 
{
	
	public DesiredCapabilities cap = new DesiredCapabilities();
	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	
	public void setup(){
		cap.setCapability("deviceName", "Device"); 
        cap.setCapability("udid", "62a8f49a"); 
        cap.setCapability("appPackage", "com.flipkart.android"); 
        cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        cap.setCapability("fullReset", false);
		cap.setCapability("noReset", false);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		wait = new WebDriverWait(driver, 30);
	}
	
	@SuppressWarnings("rawtypes")
	public void scrollDown(){
		Dimension size=null;
		try{
		 size = driver.manage().window().getSize();
		int startX=size.getWidth()/2;
		int endX=size.getWidth()/2;
		int startY=size.height/2;
		int endY=size.height/6;
		
		PointOption p=PointOption.point(startY, endY);
		WaitOptions a=WaitOptions.waitOptions(Duration.ofSeconds(2));
		
		for(int i=0;i<3;i++){
			 new TouchAction<>(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endX, endY)).release().perform();
	}
	}finally{System.out.println(size);}}
	
	@SuppressWarnings("rawtypes")
	public void scrollUp(){
		 Dimension size = driver.manage().window().getSize();
		
		int startX=size.getWidth()/2;
		int endX=size.getWidth()/2;
		int startY=size.height/2;
		int endY=size.height/6;
		
		for(int i=0;i<3;i++){
			 new TouchAction<>(driver).press(PointOption.point(startX, endY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endX, startY)).release().perform();
	}
	}
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws IOException {
		
		Touch touch=new Touch();
		touch.scrollDown();
		touch.scrollUp();
		touch.tearDown();
	}

	
	
}
