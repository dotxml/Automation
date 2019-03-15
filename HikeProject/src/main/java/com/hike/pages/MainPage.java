package com.hike.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hike.testcase.MainTestCase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPage {

	//public AndroidDriver<MobileElement> driver;
	
//	@FindBy(id="com.bsb.hike:id/conversation_item")
//	MobileElement testing_group;
	
	@FindBy(id="com.bsb.hike:id/btn_accept")
	MobileElement select_continue;
	
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	MobileElement allow_access;
	
	@FindBy(id="com.bsb.hike:id/phone_number")
	MobileElement mobile_number;
	
	@FindBy(id="com.bsb.hike:id/validate_btn")
	MobileElement validate;
	
	@FindBy(id="com.bsb.hike:id/menu_skip")
	MobileElement skip;
	
	@FindBy(id="com.bsb.hike:id/btn_positive")
	MobileElement confirm;
	
	@FindBy(linkText="Testing")
	MobileElement testing;
	
//	@FindBy(id="com.bsb.hike:id/overflow_icon_image")
//	MobileElement new_chat;
//	
	
//	@FindBy(id="com.bsb.hike:id/search")
//	MobileElement search;
//	
//	@FindBy(id="com.bsb.hike:id/search_edit_text")
//	MobileElement search_item;
//	
//	@FindBy(id="com.bsb.hike:id/friend_request_item")
//	MobileElement searched_item;
//	
	
	public MainPage(AppiumFieldDecorator appiumfile ){
		//this.driver=driver;
		PageFactory.initElements(appiumfile,this);
	}
	
//	public void tap_group(){
//		if(testing_group!=null)
//			testing_group.click();
//	}
	
	public void tap_continue(){
		if(select_continue!=null)
			select_continue.click();
	}
	
	public void tap_access(){
		if(allow_access!=null)
			allow_access.click();	
	}
	
	public void enter_number(){
		if(mobile_number!=null){
			
			mobile_number.clear();
			mobile_number.sendKeys("8147153053");
		}
	}
	
	public void tap_validate(){
		if(validate!=null)
			validate.click();	
	}
	
	public void tap_skip(){
		if(skip!=null)
			skip.click();	
	}
	
	public void tap_confirm(){
		if(confirm!=null)
			confirm.click();	
	}
	

//	public void tap_newchat(){
//		if(new_chat!=null)
//			new_chat.click();	
//	}
//	public void tap_search(){
//		if(search!=null){
//			search.click();	
//			//search.sendKeys("anshuman");
//		}
//	}
//	public void tap_searched_item(){
//		if(searched_item!=null)
//			searched_item.click();	
//	}
//	public void tap_search_item(){
//		if(search_item!=null)
//			search_item.sendKeys("anshuman");	
//	}
	
	public void tap_testing(){
		if(testing!=null)
			testing.click();
	}
	
}
