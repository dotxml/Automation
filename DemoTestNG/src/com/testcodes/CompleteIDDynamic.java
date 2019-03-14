package com.testcodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompleteIDDynamic {
	
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  	driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Dynamic Elements")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Complete id Dynamic')]")).click();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Usain Bolt");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		Thread.sleep(3000);
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
