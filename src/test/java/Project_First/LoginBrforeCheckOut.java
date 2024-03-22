package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginBrforeCheckOut {
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
		 
		 driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("nimmu@gmail.com");
		 driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("123456");
		 driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[1]/div/ul/li[10]/a/b")).isDisplayed());
        driver.findElement(By.xpath("btn btn-default add-to-cart")).click();
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		
			driver.findElement(By.id("address_delivery")).isDisplayed();
			driver.findElement(By.xpath("//tr[@class='cart_menu']")).isDisplayed();
			driver.findElement(By.name("message")).sendKeys("good product");
			driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
			driver.findElement(By.name("name_on_card")).sendKeys("asfia shahana");
			driver.findElement(By.name("card_number")).sendKeys("1234 4321 3442");
			driver.findElement(By.name("cvc")).sendKeys("3442");
			driver.findElement(By.name("expiry_month")).sendKeys("02");
			driver.findElement(By.name("expiry_year")).sendKeys("2024");
			driver.findElement(By.id("submit")).click();
			driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
		 
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}
}