package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase20 {
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
      driver.findElement(By.cssSelector("a[href='/products']")).click();
      driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
      driver.findElement(By.id("search_product")).sendKeys("Blue top");
      driver.findElement(By.id("submit_search")).click();
      driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed();
      driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
      driver.findElement(By.xpath("//a[href='/view_cart']")).click();
      driver.findElement(By.xpath("//a[@href='/login']")).click();
      driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("asfishahana@gmail.com");
		 driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("alimujju@123");
		 driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		 driver.findElement(By.xpath("//a[href='/view_cart']")).click();
		 driver.findElement(By.id("cart_info")).isDisplayed();

		 }
     @AfterSuite
     public void closebrowser()
     {
     	driver.close();
     }
      }
