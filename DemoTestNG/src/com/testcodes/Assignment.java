package com.testcodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {

	WebDriver driver=null;
//	  @Test(priority=0)
//	  public void f() {
//			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Lion");
//			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("52585252");
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("usainbolt@worldrecord.com");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("bolt");
//			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("bengaluru");
//			WebElement a= driver.findElement(By.xpath("//select[@name='country']"));
//			Select option=new Select(a);
//			option.selectByVisibleText("India");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("password");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();
//			
//	  }
//	  @Test(priority=1)
//	  public void f1(){
//		  driver.findElement(By.linkText("Signin")).click();
//		  driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
//		  driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
//		  driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
//	
//	  }

		@Test
		public void ff() throws InterruptedException{
			driver.findElement(By.linkText("Signin")).click();
			  driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
			  driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
			  driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.linkText("Alert")).click();
			  int a=driver.findElements(By.tagName("iframe")).size();
			  System.out.println(a);
			  driver.switchTo().frame(0);
			 
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
			Thread.sleep(3000);
			 
			  driver.switchTo().alert().accept();
			  
			  
			 
		}
	@Test
	public void inputAlert() throws InterruptedException{
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Input Alert')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.switchTo().alert().sendKeys("Usain Bolt");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	@Test
	public void dynamicStartsWith() throws InterruptedException{
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Dynamic Elements")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("helloworld");
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void dynamicEndsWith() throws InterruptedException{
		driver.findElement(By.linkText("Signin")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("bolt");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Dynamic Elements")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Ends With')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hellohell");
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
