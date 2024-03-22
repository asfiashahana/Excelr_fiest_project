package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase18 {
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
		driver.findElement(By.xpath("//div[@class='left-sidebar']")).isDisplayed();
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/1']"));
		driver.findElement(By.cssSelector("//h2[@class='title text-center']")).isDisplayed();
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/3']"));
		driver.findElement(By.cssSelector("//h2[@class='title text-center']")).isDisplayed();
		}
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}
}
