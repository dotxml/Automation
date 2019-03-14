package com.testcodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	String baseUrl= "https://twitter.com";
	String location="/Users/adityayadav/Downloads/chromedriver";
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", location);
	  driver= new ChromeDriver();
	  driver.get(baseUrl);
	  
	  String title=driver.getTitle();
	  System.out.println(title);
  }
}
