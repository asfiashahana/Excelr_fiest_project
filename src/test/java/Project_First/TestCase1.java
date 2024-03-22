package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	 WebDriver driver;
	 
		@BeforeTest
		public void LaunchBrowser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationexercise.com/");
		}
		
		@Test
		public void RegisterUser() 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 Assert.assertTrue(driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed());
			 driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[5]/a")).click();
			 driver.findElement(By.xpath("//b[contains(text(),'Test Cases')]")).isDisplayed();      
		}
		@AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
}
			