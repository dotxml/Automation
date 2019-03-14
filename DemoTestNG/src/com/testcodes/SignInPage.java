package com.testcodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPage {
	WebDriver driver=null;
  @Test
  public void f() {
	  
	  driver.findElement(By.linkText("Signin")).click();
	  driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
	  driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
  }
  @BeforeMethod
	public void beforeTest() {
		driver=  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php ");
	}

	@AfterTest
	public void afterTest() {

		if(driver!=null)
			driver.close();
	}

}
