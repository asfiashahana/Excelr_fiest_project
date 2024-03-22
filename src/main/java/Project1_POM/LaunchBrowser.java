package Project1_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchBrowser {

	WebDriver driver;
	
	public LaunchBrowser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Repository
	String homePageUrl = "http://automationexercise.com/";
	By homepageImage = By.cssSelector("div[class='item active'] img[alt='demo website for practice']");
	By LoginButton = By.xpath("//div[@class='shop-menu pull-right']/child::ul/child::li[4]//child::a");
	By username=By.name("name");
	By email=By.name("email");
	By signup=By.xpath("//input[@value='signup']");
	
}
