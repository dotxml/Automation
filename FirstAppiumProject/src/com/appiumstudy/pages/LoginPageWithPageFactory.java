package com.appiumstudy.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LoginPageWithPageFactory {
	
	@FindBy(id = "com.flipkart.android:id/mobileNo")
	MobileElement userName;
	
	@FindBy(id = "com.flipkart.android:id/et_password")
	MobileElement password;
	
	@FindBy(id = "com.google.android.gms:id/cancel")
	MobileElement noneOfTheAbove;
	
	@FindBy(id = "com.flipkart.android:id/btn_mlogin")
	MobileElement sign_In;
	
	@FindBy(id = "com.flipkart.android:id/btn_mlogin")
	MobileElement existing_User_Sign_In;
	
	public LoginPageWithPageFactory(AppiumFieldDecorator appiumfile) {

		PageFactory.initElements(appiumfile, this);
	}

	public void click_UsernameTextBox() {
		if(userName != null) {
			userName.click();
		}
	}
	
	public void enterUserName(String username) {
		if(userName != null) {
			userName.click();
			userName.clear();
			userName.sendKeys(username);
		}
	}
	
	public void enterPassword(String Password) {
		if(password != null) {
			password.click();
			password.clear();
			password.sendKeys(Password);
		}
	}
	
	public void click_None_Of_The_Above() {
		if(noneOfTheAbove != null) {
			noneOfTheAbove.click();
		}
	}
	
	public void click_Sign_In_Button() {
		if(sign_In != null) {
			sign_In.click();
		}
	}
	
	public void click_Existing_User_Button() {
		if(existing_User_Sign_In!= null) {
			existing_User_Sign_In.click();
		}
	}
	
}
