package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase22 {
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
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      driver.findElement(By.xpath("//div[@class='recommended_items']")).isDisplayed();
      driver.findElement(By.className("a[data-product-id='1']")).click();
      driver.findElement(By.xpath("//a[href='/view_cart']")).click();
      driver.findElement(By.xpath("//img[@class='product_image']")).isDisplayed();
     }
     @AfterSuite
     public void closebrowser()
     {
     	driver.close();
     }
     }
