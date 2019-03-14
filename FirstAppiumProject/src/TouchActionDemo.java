import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.WaitOptions.*;

import static io.appium.java_client.touch.offset.PointOption.*;




public class TouchActionDemo {

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	/**
	 * This method is used to do set up before launching 
	 */
	public void setUp() {

		capabilities.setCapability("deviceName", "Samsung Galaxy S7");
		capabilities.setCapability("os_version", "6.0.1");
		capabilities.setCapability("device_id", "ce0117113206301b0c");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 30);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This test case verify login to flipkart
	 */
	@SuppressWarnings("rawtypes")
	
	public void ScrollUp() {
		
		
	 Dimension size = driver.manage().window().getSize();
	 
	 int startX = size.getWidth()/2;
	 int endX = size.getWidth()/2;
	 int startY = size.height/2;
	 int endY = size.height/6;
	
	 for (int i = 0; i < 3; i++) {
		 new TouchAction(driver).press(point(startX, startY)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(point(endX, endY)).release().perform();

	}
	
	}
	
	@SuppressWarnings("rawtypes")
	public void ScrollDown() {
		
		
		 Dimension size = driver.manage().window().getSize();
		 
		 int startX = size.getWidth()/2;
		 int endX = size.getWidth()/2;
		 int startY = size.height/2;
		 int endY = size.height/6;
		 
		 
		 for (int i = 0; i < 2; i++) {
			 new TouchAction(driver).press(point(startX, endY)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(point(endX, startY)).release().perform();
		}
		
		}
	
	@SuppressWarnings("rawtypes")
	public void ScrollHorizontal() {
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.flipkart.android:id/carousel_view_pager")));
		
		if(element != null) {
			int startX = element.getLocation().getX() + element.getSize().getWidth()/2;
			int endX = element.getLocation().getX();

			 int startY = element.getLocation().getY() + element.getSize().getHeight()/2;
			 int endY = element.getLocation().getY() + element.getSize().getHeight()/2;
			 new TouchAction(driver).press(point(startX, startY)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(point(endX, endY)).release().perform();
		}
		
				
		}
	
	/**
	 * Quits the driver after session ends
	 */
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws IOException {
		
		TouchActionDemo touchDemo = new TouchActionDemo();
		touchDemo.setUp();
		touchDemo.ScrollHorizontal();
		touchDemo.tearDown();
	}
}
