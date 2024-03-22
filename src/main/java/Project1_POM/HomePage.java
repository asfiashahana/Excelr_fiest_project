package Project1_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends LaunchBrowser {
    private final String homePageUrl = "http://automationexercise.com/";
    private final By homepageImage = By.cssSelector("div[class='item active'] img[alt='demo website for practice']");
    private final By signupLoginButton = By.xpath("//div[@class='shop-menu pull-right']/child::ul/child::li[4]//child::a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        driver.get(homePageUrl);
    }

    public boolean isHomePageVisible() {
        return driver.findElement(homepageImage).isDisplayed();
    }

    public void clickSignupLoginButton() {
        driver.findElement(signupLoginButton).click();
    }
}

