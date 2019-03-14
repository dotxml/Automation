package com.appiumstudy.testscripts;

import org.testng.annotations.Test;

import com.appiumstudy.drivercreation.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void doLogin() {
		loginPage.click_Existing_User_Button();
		loginPage.click_UsernameTextBox();
		loginPage.click_None_Of_The_Above();
		loginPage.enterUserName("test@gmail.com");
		loginPage.enterPassword("abcd");
		loginPage.click_Sign_In_Button();
	}
	
	
	
//	
//	@Test
//	public void doLoginWithPageFactory() {
//		loginPageFactory.click_Existing_User_Button();
//		loginPageFactory.click_UsernameTextBox();
//		loginPageFactory.click_None_Of_The_Above();
//		loginPageFactory.enterUserName("test@gmail.com");
//		loginPageFactory.enterPassword("abcd");
//		loginPageFactory.click_Sign_In_Button();
//	}
}
