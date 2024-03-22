package Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase23 {
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
      driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/child::ul/child::li[4]//child::a")).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector("div[class='signup-form'] h2")).isDisplayed());
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ameesana");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("ameesana@gmail.com");
			driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
			 Assert.assertTrue(driver.findElement(By.xpath("//b[contains(.,'Enter Account Information')]")).isDisplayed());

			driver.findElement(By.id("id_gender2")).click();
	        driver.findElement(By.id("password")).sendKeys("2345");

			WebElement days=driver.findElement(By.id("days"));
			Select day=new Select(days);
			day.selectByVisibleText("15");
			
			WebElement mon=driver.findElement(By.id("months"));
			Select month=new Select(mon);
			month.selectByVisibleText("August");
			
			WebElement years=driver.findElement(By.id("years"));
			Select year=new Select(years);
			year.selectByVisibleText("1995");
			
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			
			
			driver.findElement(By.id("first_name")).sendKeys("asfia");
			driver.findElement(By.id("last_name")).sendKeys("shahana");
			driver.findElement(By.id("company")).sendKeys("hyderabad");
			driver.findElement(By.id("address1")).sendKeys("gachibowli");
			driver.findElement(By.id("address2")).sendKeys("Madhapur");
			driver.findElement(By.id("state")).sendKeys("Telangana");
			driver.findElement(By.id("city")).sendKeys("Hyderabad");
			driver.findElement(By.id("zipcode")).sendKeys("500028");
			driver.findElement(By.id("mobile_number")).sendKeys("2145758454");
			
			driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa='account-created']")).isDisplayed());
			driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).isDisplayed());
			driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
			driver.findElement(By.xpath("//header/div/div/div/div[2]/div/ul/li[3]/a")).click();
			driver.findElement(By.id("cart_info")).isDisplayed();
			driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
			driver.findElement(By.id("address_delivery")).isDisplayed();
			driver.findElement(By.id("address_invoice")).isDisplayed();
			driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
			driver.findElement(By.cssSelector("h2[data-qa='account-deleted']")).isDisplayed();
			

     }
     @AfterSuite
     public void closebrowser()
     {
     	driver.close();
     }
}
