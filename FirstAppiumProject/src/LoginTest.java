import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

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
		capabilities.setCapability("noReset", false);

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
	@Test(description = "This method verify addition of two number")
	public void verify_LoginToFlipKart() {
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")))).click();
		wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/mobileNo"))))
				.click();
		try {
			WebElement element = wait.until(
					ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.google.android.gms:id/cancel"))));
			if (element != null) {
				element.click();
			}
		} catch (Exception e) {
		
		}
		
		wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/mobileNo"))))
				.sendKeys("bokkatable.test@gmail.com");
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/et_password"))))
				.sendKeys("abcd");
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")))).click();
	}
	
	/**
	 * Quits the driver after session ends
	 */
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws IOException {
		
		LoginTest login = new LoginTest();
		login.setUp();
		login.verify_LoginToFlipKart();
		login.tearDown();
	}
}
