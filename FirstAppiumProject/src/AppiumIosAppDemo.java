import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class AppiumIosAppDemo {

	AppiumDriver<MobileElement> driver1;
	AppiumDriver<MobileElement> driver2;
	WebDriverWait wait;
	DesiredCapabilities capabilities_1 = new DesiredCapabilities();
	DesiredCapabilities capabilities_2 = new DesiredCapabilities();
	
	/**
	 * This method is used to do set up before launching 
	 */
	public void setUp() {

		
		capabilities_1.setCapability("automationName", "XCUITest");
		capabilities_1.setCapability("platformName", "iOS");
		capabilities_1.setCapability("deviceName", "iPhone 7");
		capabilities_1.setCapability("platformVersion", "12.1.2");
		capabilities_1.setCapability("udid", "c9befd87e9889c9c8e04b5ae9208f6416fbc2f37");
		capabilities_1.setCapability("newCommandTimeout", 12000);
		capabilities_1.setCapability("wdaLocalPort", 8100);
		capabilities_1.setCapability("wdaConnectionTimeout", 60000);
		capabilities_1.setCapability("app", "settings");
		capabilities_1.setCapability("simpleIsVisibleCheck", true);
		
		
		capabilities_2.setCapability("automationName", "XCUITest");
		capabilities_2.setCapability("platformName", "iOS");
		capabilities_2.setCapability("deviceName", "iPhone");
		capabilities_2.setCapability("platformVersion", "12.1.2");
		capabilities_2.setCapability("udid", "a88193f7bace560ea6bb1ecbddf7276fd004b71a");
		capabilities_2.setCapability("newCommandTimeout", 12000);
		capabilities_2.setCapability("wdaConnectionTimeout", 60000);
		capabilities_2.setCapability("app", "settings");
		capabilities_2.setCapability("wdaLocalPort", 8102);
		capabilities_2.setCapability("simpleIsVisibleCheck", true);
		
	
		try {
			driver1 = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities_1);
			driver2 = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"), capabilities_2);
			wait = new WebDriverWait(driver1, 30);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void verify_settingMenu() {
		driver1.findElementByAccessibilityId("Bluetooth").click();
		driver2.findElementByAccessibilityId("Bluetooth").click();
	}

		
	/**
	 * Quits the driver after session ends
	 */
	public void tearDown() {
		driver1.quit();
		driver2.quit();
	}

	public static void main(String[] args) throws IOException {
		
		AppiumIosAppDemo iOSApp = new AppiumIosAppDemo();
		iOSApp.setUp();
		iOSApp.verify_settingMenu();
		iOSApp.tearDown();
	}
}
