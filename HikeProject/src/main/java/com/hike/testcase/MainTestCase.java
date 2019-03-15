package com.hike.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.hike.driver.DriverSetUp;

public class MainTestCase extends DriverSetUp
{
	@Test
	public void test() throws InterruptedException{
		//mainPage.tap_group();
		mainPage.tap_continue();
		mainPage.tap_access();
		mainPage.tap_access();
		mainPage.tap_access();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		mainPage.enter_number();
		mainPage.tap_validate();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		mainPage.tap_skip();
//		mainPage.tap_confirm();
//		mainPage.tap_confirm();
//		Thread.sleep(10000);
//		mainPage.tap_newchat();
//		mainPage.tap_search();
//		mainPage.tap_search_item();
//		mainPage.tap_searched_item();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		mainPage.tap_testing();
	}
}
