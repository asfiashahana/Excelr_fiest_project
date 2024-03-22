package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllProductDetails {
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
			Assert.assertTrue(driver.findElement(By.cssSelector(".title.text-center")).isDisplayed());
		    driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
		    Assert.assertTrue(driver.findElement(By.cssSelector("div[class='product-information'] h2")).isDisplayed());
		    Assert.assertTrue(driver.findElement(By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[1]")).isDisplayed());
		    Assert.assertTrue(driver.findElement(By.cssSelector("div[class='product-information'] span span")).isDisplayed());
		    Assert.assertTrue(driver.findElement(By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[2]")).isDisplayed());
		    Assert.assertTrue(driver.findElement(By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[3]")).isDisplayed());
		    Assert.assertTrue(driver.findElement(By.xpath("//section/div/div/div[2]/div[2]/div[2]/div/p[4]")).isDisplayed());
		    
			
			}
		@AfterTest
		public void browserclose() {

			driver.quit();
		}

}
		       

