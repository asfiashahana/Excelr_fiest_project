package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase21 {
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
      driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
      driver.findElement(By.xpath("//a[@href='#reviews']")).isDisplayed();
      driver.findElement(By.id("name")).sendKeys("asfia");
      driver.findElement(By.id("email")).sendKeys("asfia@gmail.com");
      driver.findElement(By.id("review")).sendKeys("good product");
      driver.findElement(By.id("button-review")).click();
      
     }
     @AfterSuite
     public void closebrowser()
     {
     	driver.close();
     }
}
