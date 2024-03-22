package Project1_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage LoginPage;
    private InfoPage InfoPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        LoginPage = new LoginPage(driver);
        InfoPage = new InfoPage(driver);

        homePage.navigateToHomePage();
    }

    @Test
    public void testSignupAndDeleteAccount() {
        // Step 3: Verify that the home page is visible successfully
        Assert.assertTrue(homePage.isHomePageVisible(), "Home page is not visible");

        // Step 4: Click on 'Signup / Login' button
        homePage.clickSignupLoginButton();

        // Step 5: Verify 'New User Signup!' is visible
        Assert.assertTrue(LoginPage.isNewUserSignupVisible(), "New User Signup! is not visible");

        // Continue with the remaining steps...
        // Steps 6-18: Perform actions on Signup/Login and Account Information pages
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}