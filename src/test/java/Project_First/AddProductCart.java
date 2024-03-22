package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddProductCart {
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
			driver.findElement(By.cssSelector("a[href='/products']")).click();
	        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
	        driver.findElement(By.cssSelector("button[data-dismiss='modal']")).click();
	        driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")).click();
	        driver.findElement(By.cssSelector("a[href='/view_cart']u")).click();
	        driver.findElement(By.cssSelector("a[data-product-id='1']")).isDisplayed();
	        driver.findElement(By.cssSelector("a[data-product-id='2']")).isDisplayed();
	        driver.findElement(By.xpath("//td[contains(@class, 'cart_price')]/p")).isDisplayed();
	        driver.findElement(By.xpath("//td[contains(@class, 'cart_quantity')]/button")).isDisplayed();
	        driver.findElement(By.xpath("//p[contains(@class, 'cart_total_price')]")).isDisplayed();
		}
		@AfterSuite
		public void closebrowser()
		{
			driver.close();
		}
	
}
		