package Project1_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LaunchBrowser {
    private final By newUserSignupText = By.xpath("//div[@class='signup-form']/h2");
    private final By nameInput = By.xpath("//input[@name='name']");
    private final By emailInput = By.xpath("//input[@name='email']");
    private final By signupButton = By.xpath("//button[contains(text(),'Signup')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewUserSignupVisible() {
        return driver.findElement(newUserSignupText).isDisplayed();
    }

    public void enterNameAndEmail(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }
}