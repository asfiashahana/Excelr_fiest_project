package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductQuantity {
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
		driver.findElement(By.xpath("//i[@class='fa fa-plus-square']")).click();
		driver.findElement(By.xpath("//div[@style='height: auto !important;']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='quantity']")).clear();
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("4");
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		driver.findElement(By.xpath("//td[@class='cart_product']")).isDisplayed();
		
       
		
}

	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}
}
