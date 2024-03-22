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

public class ContactUs {

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
			 driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[8]/a")).click();
			 WebElement getInTouchHeader = driver.findElement(By.xpath("//h2[contains(text(),'Get In Touch')]"));
		        Assert.assertTrue(getInTouchHeader.isDisplayed(), "'GET IN TOUCH' header is not visible");
		       driver.findElement(By.name("name")).sendKeys("Asfia");
		       driver.findElement(By.name("email")).sendKeys("asfia@gmail.com");
		       driver.findElement(By.name("subject")).sendKeys("English");
		       driver.findElement(By.name("message")).sendKeys("Automation");
		    
		       WebElement submitButton = driver.findElement(By.cssSelector("input[data-qa=\"submit-button\"]"));
		        submitButton.click();
		       driver.switchTo().alert().accept();
		       driver.findElement(By.xpath("//div[contains(text(),'Success! Your details have been submitted successfully')]")).isDisplayed();
		       driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		       
		}
		@AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
}
		     



