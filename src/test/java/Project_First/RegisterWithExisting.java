package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterWithExisting {

	 WebDriver driver;
	 
		@BeforeTest
		public void LaunchBrowser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com/");
		}
		@Test
		public void RegisterUser() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
			 driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/child::ul/child::li[4]//child::a")).click();
			 Assert.assertTrue(driver.findElement(By.cssSelector("div[class='signup-form'] h2")).isDisplayed());
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asfiashahana");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("asfiashahana@gmail.com");
			driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Email Address already exist!')]")).isDisplayed();
			
	        
}
		@AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
}