package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncorrectData {
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
			 Assert.assertTrue(driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed());
			 
			 driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("asfishahana@gmail.com");
			 driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("ali@123");
			 driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
			 WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Your email or password is incorrect!')]"));
		        Assert.assertTrue(errorMessage.isDisplayed());
		    }
	
		@AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
   }


