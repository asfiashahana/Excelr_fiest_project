package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RemoveProductCard {
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
		 driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		 driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		 driver.findElement(By.id("cart_info")).isDisplayed();
		 driver.findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
		 driver.findElement(By.id("empty_cart")).isDisplayed();
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}
	
}
		
