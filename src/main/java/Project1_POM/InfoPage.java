package Project1_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoPage extends LaunchBrowser {
    private final By enterAccountInfoText = By.xpath("//div[contains(text(),'ENTER ACCOUNT INFORMATION')]");
    // Add locators for other elements on this page

    public InfoPage(WebDriver driver) {
        super(driver);
    }

    public boolean isEnterAccountInfoVisible() {
        return driver.findElement(enterAccountInfoText).isDisplayed();
    }

    // Add methods to fill details on this page
}